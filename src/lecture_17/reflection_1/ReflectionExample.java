package lecture_17.reflection_1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionExample {
    public static void main(String[] args) {
        Class<Employee> employeeClass = Employee.class;

        System.out.println("Имя класса: " + employeeClass.getName());

        Class<?> superClass = employeeClass.getSuperclass();
        System.out.println("Суперкласс: "
                + (superClass !=null ? superClass.getName() : "нет суперкласса"));

        Class<?>[] interfaces = employeeClass.getInterfaces();
        System.out.println("Интерфейсы: " + Arrays.toString(interfaces));

        Field[] declaredFields = employeeClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("Имя поля: " + declaredField.getName()
                    + " Тип поля: " + declaredField.getType());
        }

        Method[] declaredMethods = employeeClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("Имя метода: " + declaredMethod.getName()
            + " Возвращаемый тип: " + declaredMethod.getReturnType().getName());
        }

        Constructor<?>[] declaredConstructors = employeeClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("Имя конструктора: " + declaredConstructor.getName()
                    + " Параметры: " + Arrays.toString(declaredConstructor.getParameterTypes()));
        }

        Annotation[] annotations = employeeClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation.annotationType().getName());
        }

    }
}
