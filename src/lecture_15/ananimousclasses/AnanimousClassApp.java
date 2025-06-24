package lecture_15.ananimousclasses;

public class AnanimousClassApp {
    public static void main(String[] args) {

        Animal cat = new Animal() {
            @Override
            void eat() {
                System.out.println("Кот ест рыбу");
            }
        };


        Sound dog = new Sound(){
            @Override
            public void makeSound() {
                System.out.println("Собака лает");
            }
        };
    }
}
