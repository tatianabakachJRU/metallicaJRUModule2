package lecture_7.instanceof_3;

public class InstanceofExample_3 {
    public static void main(String[] args) {
        Animal animal = new Snake();
        animal.makeSound();

        if(animal instanceof Cow){
            System.out.println("Это корова");
        } else if (animal instanceof Snake){
            System.out.println("Это змея");
        } else {
            System.out.println("Не принадлежит ни к одному из указанных типов");
        }
    }
}
