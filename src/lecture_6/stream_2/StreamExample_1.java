package lecture_6.stream_2;

import java.util.stream.Stream;

public class StreamExample_1 {
    public static void main(String[] args) {
        Stream<String> fruits = Stream.of("Apple", "Banana", "Peach");
        fruits.forEach(System.out::println);

        Stream<Double> numbers = Stream.generate(Math::random).limit(5);
        numbers.forEach(System.out::println);

        Stream<String> stream1 = Stream.of("A", "B", "V");
        Stream<String> stream2 = Stream.of("R", "T", "W");

        Stream<String> concat = Stream.concat(stream1, stream2);
        concat.forEach(System.out::println);


    }
}
