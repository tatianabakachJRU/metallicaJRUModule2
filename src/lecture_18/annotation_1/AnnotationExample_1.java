package lecture_18.annotation_1;

import java.util.ArrayList;
import java.util.List;

public class AnnotationExample_1 {

    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void deprecatedMethod(){

    }

    @SuppressWarnings("rawtypes")
    public void suppressWarningMethod(){
        List list = new ArrayList();
    }

    @SafeVarargs
    public static <T> void safeVarargsMethod(T... element){
        for (T t : element) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {

    }
}
