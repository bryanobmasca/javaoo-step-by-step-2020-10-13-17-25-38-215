package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int klass;
    private Student leader;
    private List<Student> studentList = new ArrayList<Student>();

    public Klass(int klass) {
        this.klass = klass;
    }

    public int getNumber() {
        return klass;
    }

    public String getDisplayName() {
        return String.format("Class %d", getNumber());
    }

    public Student assignLeader(Student leader) {
        if (!studentList.contains(leader)){
            System.out.print("It is not one of us.\n");
            return null;
        }
        else{
            return this.leader = leader;
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student member) {
        studentList.add(member);
    }
}
