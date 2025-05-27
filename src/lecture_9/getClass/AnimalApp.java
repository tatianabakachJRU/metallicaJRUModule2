package lecture_9.getClass;

public class AnimalApp {
    public static void main(String[] args) {
        Sheep sheep = new Sheep();
        Class<? extends Sheep> aClass = sheep.getClass();

        System.out.println(aClass.getName());
    }
}
