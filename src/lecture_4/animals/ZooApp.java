package lecture_4.animals;

public class ZooApp {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        bird.printInfo();
        Animal.staticMethod();
    }
}
