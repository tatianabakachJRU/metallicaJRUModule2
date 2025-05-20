package lecture_7.instanceof_2;

import lecture_7.instanceof_1.Animal;
import lecture_7.instanceof_1.Cat;
import lecture_7.instanceof_1.Dog;

import java.util.ArrayList;

public class InstanceofExample_2 {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Dog());
        animals.add(new Animal());

        for (Animal animal : animals) {
            if(animal instanceof Dog){
                System.out.println("Это собака!");
            }else {
                System.out.println("Это НЕ собака!");

            }
        }

    }
}
