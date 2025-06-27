package lecture_17.reflection_3;

public class Dog {
    private String name;
    private int age;

    public Dog() {
        this.name = "Рекс";
        this.age = 5;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
