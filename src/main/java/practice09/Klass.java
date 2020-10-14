package practice09;

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

    public Student assignLeader(Student leader) {
        if (!leader.getKlass().equals(getNumber())){
            System.out.print("It is not one of us.\n");
            return null;
        }
        else {
            return leader = leader;
        }
    }

    public Student getLeader() {
        return leader;
    }
}
