package lecture_7.instanceof_4;

public class InstanceofExample_5 {
    public static void main(String[] args) {
        Object object = "Hello Metallica";

        // старый синтаксис
        if(object instanceof String){
            String str = (String) object;
            System.out.println(str.toLowerCase());
        }

        // новый синтаксис
        if(object instanceof String str){
            System.out.println(str.toLowerCase());
        }
    }
}
