package lecture_8.constructors_1;

public class CatApp {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat1 = new Cat("Vasiliy", 2);
        Cat cat2 = new Cat(14);
        System.out.println(cat);
        System.out.println(cat1);
        System.out.println(cat2);
    }
}
