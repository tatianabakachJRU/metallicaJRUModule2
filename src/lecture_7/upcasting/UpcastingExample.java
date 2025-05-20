package lecture_7.upcasting;

public class UpcastingExample {
    public static void main(String[] args) {
        Cow cow = new Cow(); // один объект
        Animal animal = cow;
        Object object = cow;

        cow.makeSound();
        animal.makeSound();
        // ошибка компиляции, т.к.у класса object нет метода makeSound()
        //object.makeSound();
    }
}
