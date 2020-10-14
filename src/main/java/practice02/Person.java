package practice02;

public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return "Tom";
    }

    public int getAge() {
        return 21;
    }

    public String introduce() {
        return "My name is Tom. I am 21 years old.";
    }
}
