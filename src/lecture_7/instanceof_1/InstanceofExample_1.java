package lecture_7.instanceof_1;

public class InstanceofExample_1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog1 = null;

        System.out.println(dog instanceof Dog);
        System.out.println(dog instanceof Animal);
        System.out.println(dog instanceof Object);
        System.out.println(dog instanceof Eating);
        //System.out.println(dog instanceof Cat);
        System.out.println(dog1 instanceof Dog);

        Cat cat = new Cat();

        System.out.println(cat instanceof Eating);
    }
}
