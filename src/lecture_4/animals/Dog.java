package lecture_4.animals;

public class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Гав-гав");
    }

    @Override
    public int count() {
        return 0;
    }

}
