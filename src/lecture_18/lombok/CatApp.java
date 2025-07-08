package lecture_18.lombok;

public class CatApp {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat1 = new Cat("Василий", 13);

        System.out.println(cat1.getName());
        System.out.println(cat1.getAge());

        System.out.println(cat1);
    }
}
