package lecture_1.abstraction;

import lecture_1.incapsulation.IncapsulationApp;

public class PetApp {
    public static void main(String[] args) {
        Dog pinky = new Dog("Pinky");
        Cow bessy = new Cow("Bessy");

        pinky.makeSound();
        pinky.printName();
        bessy.makeSound();
        bessy.printName();
        pinky.eatMeat();
        bessy.eatGrass();

        IncapsulationApp incapsulationApp = new IncapsulationApp();
        int a2 = incapsulationApp.a2;

        Puppy rex = new Puppy("Rex");
        rex.eatMeat();
        rex.makeSound();
        rex.printName();
        rex.play();

        Pet max = new Puppy("Max");
        max.printName();
        max.makeSound();

    }
}
