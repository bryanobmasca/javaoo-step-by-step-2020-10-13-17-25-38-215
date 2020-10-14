package practice08;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        String klassNumber = "";
        if (klass != null){
            klassNumber = String.format("Class %d", klass.getNumber());
        }
        return String.format("%s I am a Teacher. I teach %s.", super.introduce(), klassNumber);
    }
}
