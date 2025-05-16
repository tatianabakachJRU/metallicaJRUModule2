package lecture_6.stream_5;

import java.util.List;

public class StreamMatchExample {
    public static void main(String[] args) {
        List<String> listNames
                = List.of("Alice", "Atyn", "Bob", "Charlie", "Alice", "David", "Eva",
                "Charlie", "Frank", "Mary", "Anna", "Andy");

        boolean result1 = listNames.stream().anyMatch(name -> name.equals("Alice"));
        System.out.println(result1);

        boolean result2 = listNames.stream().allMatch(name -> name.startsWith("A"));
        System.out.println(result2);

        boolean result3 = listNames.stream().noneMatch(name -> name.startsWith("Z"));
        System.out.println(result3);
    }
}
