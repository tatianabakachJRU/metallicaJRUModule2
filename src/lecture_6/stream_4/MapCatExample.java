package lecture_6.stream_4;

import java.util.Arrays;
import java.util.List;

public class MapCatExample {
    public static void main(String[] args) {
        List<Cat> catList = Arrays.asList(
                new Cat("Rex", 10),
                new Cat("Fex", 5),
                new Cat("Pex", 11),
                new Cat("Lex", 3),
                new Cat("Tex", 7)
        );

        List<String> list = catList.stream()
                .map(Cat::getName)
                .toList();
        System.out.println(list);

        List<String> list1 = catList.stream()
                .filter(cat -> cat.getAge() >= 7)
                .map(Cat::getName)
                .sorted()
                .toList();
        System.out.println(list1);

    }
}
