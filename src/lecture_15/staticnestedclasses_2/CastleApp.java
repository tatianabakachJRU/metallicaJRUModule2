package lecture_15.staticnestedclasses_2;

public class CastleApp {
    public static void main(String[] args) {
        Castle castle = new Castle();
        castle.methodCastleClass();

        Castle.Dragon dragon = new Castle.Dragon();
    }
}
