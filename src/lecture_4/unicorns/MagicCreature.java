package lecture_4.unicorns;

import lecture_2.abstractuion.Animal;
import lecture_4.animals.CanFly;

import java.io.Serializable;

public abstract class MagicCreature implements Serializable {
    public String name;

    public MagicCreature(String name) {
        this.name = name;
    }

    public abstract void performMagic();

    public void displayName(){
        System.out.println("Этого единорога зовут " + name);
    }
}
