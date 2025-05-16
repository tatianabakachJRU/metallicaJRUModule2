package lecture_6.stream_3;

import java.util.List;

public class StreamMethodsExample {
    public static void main(String[] args) {
        List<String> listNames
                = List.of("Alice", "Atyn", "Bob", "Charlie", "Alice", "David", "Eva",
                "Charlie", "Frank", "Mary", "Anna", "Andy");

        listNames.stream()
                .distinct()
                .filter(name -> name.startsWith("A"))
                .sorted()
                //.peek(name -> System.out.println("After sorted: " + name))
                .limit(3)
                .skip(1)
                .forEach(System.out::println);

    }
}
