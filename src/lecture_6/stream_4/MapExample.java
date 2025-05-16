package lecture_6.stream_4;

import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<String> listNames
                = List.of("Alice", "Atyn", "Bob", "Charlie", "Alice", "David", "Eva",
                "Charlie", "Frank", "Mary", "Anna", "Andy");

        List<Integer> list = listNames.stream()
                .map(String::length)
                .toList();

        System.out.println(list);
    }
}
