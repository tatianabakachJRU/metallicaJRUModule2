package lecture_9.equals;

public class CatApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Boris", 3);
        Cat cat1 = cat;
        System.out.println(cat1.hashCode());

        Cat cat2 = new Cat("Boris", 5);
        System.out.println(cat.equals(cat2));

        System.out.println(cat1.hashCode());

    }
}
