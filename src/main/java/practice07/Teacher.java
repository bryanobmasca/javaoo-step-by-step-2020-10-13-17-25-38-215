package practice07;

import java.util.Objects;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
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
}
