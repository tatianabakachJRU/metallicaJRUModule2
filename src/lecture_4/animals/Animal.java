package lecture_4.animals;

interface Animal {
    String name = null;

    static void staticMethod(){
        System.out.println("Статический метод");
    }

    void makeSound();

    int count();

    default void printInfo(){
        System.out.println("Это животное");
    }
}
