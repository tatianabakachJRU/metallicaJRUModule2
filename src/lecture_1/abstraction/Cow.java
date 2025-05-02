package lecture_1.abstraction;

public class Cow extends Pet{
    int age;

    public Cow(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Муууууу");
    }

    void eatGrass(){
        System.out.println("Корова кушает траву");
    }
}
