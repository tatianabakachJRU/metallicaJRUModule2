package lecture_2.abstractuion;

public abstract class Pet extends Animal implements Trainable {

    public Pet(String name) {
        super(name);
    }

    abstract void play();

    void eat(){
        System.out.println(getName() + " ест");
    }

    @Override
    void info() {
        System.out.println("Это питомец: " + getName());
    }
}
