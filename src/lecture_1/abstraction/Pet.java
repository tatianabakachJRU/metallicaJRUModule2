package lecture_1.abstraction;

public abstract class Pet {
    String name;

    public Pet(String name) {
        this.name = name;
    }

    abstract void makeSound();

    void printName(){
        System.out.println("Имя животного: " + name);
    }
}
