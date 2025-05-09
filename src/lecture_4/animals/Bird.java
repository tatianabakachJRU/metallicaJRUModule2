package lecture_4.animals;

public class Bird implements Animal, CanFly{

    @Override
    public void makeSound() {
        System.out.println("Чирик-чирик");
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public void fly() {
        System.out.println("Я могу летать");
    }

    @Override
    public void printInfo() {
        System.out.println("Это птица");
    }
}
