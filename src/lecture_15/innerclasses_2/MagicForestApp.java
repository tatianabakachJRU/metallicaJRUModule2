package lecture_15.innerclasses_2;

public class MagicForestApp {
    public static void main(String[] args) {
        MagicForest magicForest = new MagicForest();
        magicForest.methodOuterClass();
        System.out.println("*".repeat(15));
        magicForest.new Fairy().methodInnerClass();
    }
}
