package practice07;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        return String.format("%s I am a Teacher. I teach Class %d.", super.introduce(), klass.getNumber());
    }
}
