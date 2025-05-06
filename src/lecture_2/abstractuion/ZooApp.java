package lecture_2.abstractuion;

public class ZooApp {
    public static void main(String[] args) {
        Cat kitty = new Cat("Kitty");
        System.out.println(kitty.getName());
        kitty.sound();
        kitty.play();
        kitty.train();
        kitty.info();
        kitty.eat();

        Animal boris = new Cat("Boris");
        boris.info();
    }
}
