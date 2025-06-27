package lecture_17.reflection_2;

public class ReflectionExample {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Class<Cat> catClass = Cat.class;
        Cat cat = catClass.newInstance();
        System.out.println(cat.getName());


    }
}
