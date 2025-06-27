package lecture_17.reflection_3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionExample {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Dog> dogClass = Dog.class;

        Constructor<Dog> constructorWithParameters
                = dogClass.getConstructor(String.class, int.class);

        Constructor<Dog> constructor = dogClass.getConstructor();

        Dog dog = constructorWithParameters.newInstance("Гарри", 2);
        System.out.println(dog.getName());

        Dog dog1 = constructor.newInstance();
        System.out.println(dog1.getName());


    }
}
