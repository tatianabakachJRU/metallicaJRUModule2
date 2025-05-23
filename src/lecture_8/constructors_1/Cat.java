package lecture_8.constructors_1;

public class Cat {
    private String name;
    private int age;

    public Cat() {
    }

    private Cat(String name) {
        this.name = name;
    }

    public Cat(int age) {
        this.name = "Barsik";
        this.age = age;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
