package lecture_1.abstraction;

public class Dog extends Pet{
    public Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Гав-гав!");
    }

    void eatMeat(){
        System.out.println("Собака кушает мясо");
    }

}
