package practice10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person{
    private LinkedList<Klass> klassLinkedList;

    public Teacher(int id, String name, int age, LinkedList<Klass> klassLinkedList) {
        super(id, name, age);
        this.klassLinkedList = klassLinkedList;

    }

    public LinkedList<Klass> getClasses() {
        return klassLinkedList;
    }

    public String introduce(){
        String klassNumber = "Class ";
        for (Klass classesList : klassLinkedList){
            klassNumber += classesList.getNumber() + ", ";
        }
        if(klassNumber.endsWith(", "))
        {
            klassNumber = klassNumber.substring(0,klassNumber.length() - 2);
        }
        return String.format("%s I am a Teacher. I teach %s.", super.introduce(), klassNumber);
    }
}
