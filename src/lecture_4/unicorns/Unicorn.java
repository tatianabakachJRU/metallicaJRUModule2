package lecture_4.unicorns;

public interface Unicorn  {
    String DEFAULT_COLOR = "Белый";
    int MAX_SPEED = 100;
    String FAVORITE_FOOD = "Магическая трава";

    void gallop();
    void eat(String food);

    default void displayInfo(){
        System.out.println("Это магический единорог");
    }

    static void sayHello(){
        System.out.println("Привет из мира единорогов");
    }

    static void listCharacteristics(){
        System.out.println("Характеристики единорога по умолчанию:");
        System.out.println("Цвет по умолчанию: " + DEFAULT_COLOR);
        System.out.println("Скорость максимальная: " + MAX_SPEED);
        System.out.println("Любимая еда: " + FAVORITE_FOOD);
    }
}
