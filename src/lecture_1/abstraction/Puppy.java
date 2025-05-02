package lecture_1.abstraction;

import java.io.Serializable;

public class Puppy extends Dog implements Cloneable, Serializable {

    public Puppy(String name) {
        super(name);
    }

    void play(){
        System.out.println("Pappy plays");
    }

    @Override
    void makeSound() {
        System.out.println("Тяф-тяф");
        super.makeSound();
    }
}
