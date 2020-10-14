package practice08;

public class Klass {
    private int klass;
    private Student leader;

    public Klass(int klass) {
        this.klass = klass;
    }

    public int getNumber() {
        return klass;
    }

    public String getDisplayName() {
        return String.format("Class %d", getNumber());
    }

    public Student assignLeader(Student name) {
        return leader = name;
    }

    public Student getLeader() {
        return leader;
    }
}
