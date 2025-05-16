package lecture_6.stream_7;

import java.util.List;
import java.util.Optional;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 3, 2);
        List<String> listNames
                = List.of("Alice", "Atyn", "Bob", "Charlie", "Alice", "David", "Eva",
                "Charlie", "Frank", "Mary", "Anna", "Andy");

        Optional<String> first = listNames.stream()
                .filter(name -> name.startsWith("B"))
                .findFirst();
        // .findAny();
        String string = first.get();
        System.out.println(string);

        Optional<Integer> min = integers.stream()
                .min(Integer::compareTo);
        Integer i = min.get();
        System.out.println(i);

        Optional<Integer> max = integers.stream()
                .max(Integer::compareTo);
        Integer t = max.get();
        System.out.println(t);

        long count = integers.stream().count();
        System.out.println(count);


    }
}
