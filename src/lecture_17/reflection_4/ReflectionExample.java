package lecture_17.reflection_4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        Cat cat = new Cat("Том", 4);
        System.out.println(cat);

        Class<? extends Cat> catClass = cat.getClass();

        try {
            Field nameField = catClass.getDeclaredField("name");
            nameField.setAccessible(true);
            nameField.set(cat, "Джерри");
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        try {
            Method meowMethod = catClass.getDeclaredMethod("meow");
            meowMethod.setAccessible(true);
            meowMethod.invoke(cat);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        System.out.println(cat);

        try {
            Constructor<? extends Cat> privateConstructor = catClass.getDeclaredConstructor();
            privateConstructor.setAccessible(true);
            Cat cat1 = privateConstructor.newInstance();
            System.out.println(cat1);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
