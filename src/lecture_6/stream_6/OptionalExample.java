package lecture_6.stream_6;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        Optional<String> alice = Optional.of("Alice");

        Optional<String> o = Optional.ofNullable(null);

        Optional<Object> empty = Optional.empty();

        if (alice.isPresent()){

        }

        String string = alice.get();

        String string1 = alice.orElse("Unknown");

        String string2 = alice.orElseGet(() -> "Generated Name");

        String string3 = alice.orElseThrow(() -> new IllegalArgumentException("Value is missing"));

    }
}
