package lecture_2.abstractuion;

public class Cat extends Pet {

    @Override
    Cat getAnimal() {
        return new Cat("Betsy");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    void play() {
        System.out.println(getName() + " играет в мяч");
    }

    @Override
    public void sound() {
        System.out.println("Мяу-мяу");
    }

    @Override
    public void train() {
        System.out.println(getName() + " обучается новым трюкам");
    }

    @Override
    void info() {
        System.out.println("Это котик: " + getName());
    }
}
