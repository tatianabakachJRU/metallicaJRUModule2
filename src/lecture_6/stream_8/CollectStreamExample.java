package lecture_6.stream_8;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectStreamExample {
    public static void main(String[] args) {
        List<String> listNames
                = List.of("Alice", "Atyn", "Bob", "Charlie", "Alice", "David", "Eva",
                "Charlie", "Frank", "Mary", "Anna", "Andy");

        Set<String> setNames = listNames.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toSet());

        System.out.println(setNames);

        Map<String, Integer> mapNames = listNames.stream()
                .distinct()
                .collect(Collectors.toMap(name -> name, String::length));
        System.out.println(mapNames);

        String joiningNames = listNames.stream()
                .filter(name -> name.length() > 4)
                .collect(Collectors.joining(", "));
        System.out.println(joiningNames);

        Map<Integer, List<String>> groupingByNames = listNames.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(groupingByNames);

        Map<Integer, List<String>> mappingNames = listNames.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.mapping(String::toUpperCase, Collectors.toList())
                ));
        System.out.println(mappingNames);


    }
}
