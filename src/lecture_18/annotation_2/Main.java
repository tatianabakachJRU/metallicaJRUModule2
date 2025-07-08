package lecture_18.annotation_2;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        MyAnnotationApp myAnnotationApp = new MyAnnotationApp();

        Method method = myAnnotationApp.getClass().getMethod("annotatedMethod");

        if(method.isAnnotationPresent(MyAnnotation.class)){
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);

            String value = annotation.value();
            int number = annotation.number();

            System.out.println(value);
            System.out.println(number);
        }

        myAnnotationApp.annotatedMethod();
    }
}
