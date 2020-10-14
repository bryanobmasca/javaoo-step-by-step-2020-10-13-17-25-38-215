package practice06;

public class Teacher extends Person{
    private int klass;
    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return klass;
    }

    public String introduce(){
        String klassNumber = "";
        if (klass != 0){
            klassNumber = String.format("Class %d", klass);
        }
        else {
            klassNumber = "No Class";
        }
        return String.format("%s I am a Teacher. I teach %s.", super.introduce(), klassNumber);
    }
}
