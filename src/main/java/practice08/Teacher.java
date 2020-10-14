package practice08;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        String klassNumber = "";
        if (klass != null){
            klassNumber = String.format("Class %d", klass.getNumber());
        }
        else {
            klassNumber = "No Class";
        }
        return String.format("%s I am a Teacher. I teach %s.", super.introduce(), klassNumber);
    }

    public String introduceWith(Student name) {
        String teachMessage = "teach";
        return String.format("%s I am a Teacher. I %s %s.", super.introduce(), teachMessage, name.getName());
    }
}
