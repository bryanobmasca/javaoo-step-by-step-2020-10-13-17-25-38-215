package practice10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person{
    private LinkedList<Klass> klassLinkedList = new LinkedList<>();

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
        String classesDisplayName = (!klassLinkedList.isEmpty())
                ? String.format("Class %s", klassLinkedList.stream().map(klass -> Integer.toString(klass.getNumber())).collect(Collectors.joining(", ")))
                : "No Class";
        return String.format("%s I am a Teacher. I teach %s.", super.introduce(), classesDisplayName);
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
