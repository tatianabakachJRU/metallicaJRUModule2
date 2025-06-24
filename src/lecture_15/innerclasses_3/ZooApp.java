package lecture_15.innerclasses_3;

public class ZooApp {
    public static void main(String[] args) {
        Zoo.staticMethodOuterClass();

        Zoo zoo = new Zoo();
        Zoo.Animal animal = zoo.new Animal();
    }
}
