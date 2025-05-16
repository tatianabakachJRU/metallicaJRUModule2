package lecture_6.stream_1;

import java.util.Arrays;
import java.util.List;

public class IntermediateOperation {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Dave", "Anna");

        List<String> list = names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .toList();
        System.out.println(list);

    }
}
