package lecture_15.innerclasses_1;

public class UnicornLandApp {
    public static void main(String[] args) {
        UnicornLand unicornLand = new UnicornLand();
        UnicornLand.Unicorn unicorn = unicornLand.new Unicorn();
        unicorn.display();
    }
}
