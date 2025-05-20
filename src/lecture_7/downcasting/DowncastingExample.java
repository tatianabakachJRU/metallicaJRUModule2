package lecture_7.downcasting;

public class DowncastingExample {
    public static void main(String[] args) {
        Animal animal = new Animal();

         if(animal instanceof Tiger){
            Tiger tiger = (Tiger) animal;
            tiger.makeSound();
        } else {
            System.out.println("Это животное не тигр");
        }
    }
}
