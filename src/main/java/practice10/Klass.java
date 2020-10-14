package practice10;

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
        if (!leader.getClass().equals(getNumber())){
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

}
