package lecture_4.unicorns;

public class UnicornApp {
    public static void main(String[] args) {
        Unicorn.sayHello();
        Unicorn.listCharacteristics();

        SparkleUnicorn sparkleUnicorn = new SparkleUnicorn();
        Unicorn mysticUnicorn = new MysticUnicorn();

        sparkleUnicorn.displayInfo();
        sparkleUnicorn.gallop();
        sparkleUnicorn.eat("Магическая трава");
        sparkleUnicorn.gallop();
        sparkleUnicorn.performMagic();

        System.out.println("*******************");


        mysticUnicorn.displayInfo();
        mysticUnicorn.gallop();
        mysticUnicorn.eat("Одуванчики");
        mysticUnicorn.gallop();
    }
}
