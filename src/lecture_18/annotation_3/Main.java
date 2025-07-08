package lecture_18.annotation_3;

public class Main {
    public static void main(String[] args) {
        if(Child.class.isAnnotationPresent(CatAnnotation.class)){
            CatAnnotation annotation = Child.class.getAnnotation(CatAnnotation.class);
            System.out.println(annotation.value());
        }
    }
}
