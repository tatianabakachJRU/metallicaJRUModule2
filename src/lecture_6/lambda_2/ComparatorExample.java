package lecture_6.lambda_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Abba", "Bob", "Alice", "Barbara");

                        //compare(a, b) {a.compareTo(b)}
        Collections.sort(list, (a, b) -> a.compareTo(b));

        System.out.println(list);


        // создать класс который implements Comparator
        // у этого класса реализовать метод compare
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }
}
