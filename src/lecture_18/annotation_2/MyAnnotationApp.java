package lecture_18.annotation_2;

public class MyAnnotationApp {
    @MyAnnotation(value = "Привет", number = 4)
    public void annotatedMethod(){
        System.out.println("Этот метод аннотирован");
    }
}
