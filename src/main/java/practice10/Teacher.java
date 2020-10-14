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

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public LinkedList<Klass> getClasses() {
        return klassLinkedList;
    }

    public String introduce(){
        String klassNumber = "Class ";
        if (klassLinkedList != null) {
            for (Klass classesList : klassLinkedList) {
                klassNumber += classesList.getNumber() + ", ";
            }
            if (klassNumber.endsWith(", ")) {
                klassNumber = klassNumber.substring(0, klassNumber.length() - 2);
            }
        }
        else {
            klassNumber = "No Class";
        }
        return String.format("%s I am a Teacher. I teach %s.", super.introduce(), klassNumber);
    }

    public boolean isTeaching(Student student) {
        if (!klassLinkedList.contains(student.getKlass())){
            return false;
        }
        else{
            return true;
        }
    }

    public String introduceWith(Student student) {
        String teachMessage = "teach";
        if (!klassLinkedList.contains(student.getKlass())){
            teachMessage = "don't " + teachMessage;
        }
        return String.format("%s I am a Teacher. I %s %s.", super.introduce(), teachMessage, student.getName());
    }
}
