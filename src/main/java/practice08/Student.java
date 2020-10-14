package practice08;

public class Student extends Person{
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        String leaderMessage = "at Class";
        if (klass.getLeader() != null && klass.getLeader().getName().equals(getName())){
            leaderMessage = "Leader of Class";
        }
        return String.format("%s I am a Student. I am %s %d.", super.introduce(), leaderMessage, klass.getNumber());
    }
}
