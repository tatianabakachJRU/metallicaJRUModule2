package lecture_17.reflection_4;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Cat() {
        this.name = "Марсик";
        this.age = 3;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private void meow(){
        System.out.println("Мяу! Я хочу есть!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
