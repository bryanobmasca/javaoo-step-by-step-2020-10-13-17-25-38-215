package practice10;

import java.util.LinkedList;

public class Teacher extends Person{
    private LinkedList<Klass> klassLinkedList;

    public Teacher(int id, String name, int age, LinkedList<Klass> klassLinkedList) {
        super(id, name, age);
        this.klassLinkedList = klassLinkedList;

    }

    public LinkedList<Klass> getClasses() {
        return klassLinkedList;
    }
}
