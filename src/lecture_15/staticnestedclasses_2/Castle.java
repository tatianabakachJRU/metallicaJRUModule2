package lecture_15.staticnestedclasses_2;

public class Castle {

    static class Dragon{
        static String dragonName = "Драко";
        String fireBreathe = "Пылающий огонь";

        static void roar(){
            System.out.println(dragonName + " грозно рычит");
        }

        void breatheFire(){
            System.out.println(dragonName + " изрыгает " + fireBreathe);
        }
    }

    void methodCastleClass(){
        System.out.println(Dragon.dragonName);
        Dragon.roar();

        Dragon dragon = new Dragon();
        System.out.println(dragon.fireBreathe);
        dragon.breatheFire();
    }
}
