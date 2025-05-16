package lecture_6.lambda_3;

import java.util.List;
import java.util.function.Consumer;

public class ExampleForEach {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");

        // сделайте сами лямбду
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String string) {
                System.out.println(string);
            }
        });
    }
}
