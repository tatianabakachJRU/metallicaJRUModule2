package lecture_8.static_2;

public class MathUtil {
    static int staticField;
    int nonStaticField;

    public static int add (int a, int b){
        return a + b;
    }

    public void nonStaticMethod (){
        System.out.println("Non Static Method");
    }
}
