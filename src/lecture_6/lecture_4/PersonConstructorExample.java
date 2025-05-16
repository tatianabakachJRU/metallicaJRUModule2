package lecture_6.lecture_4;

import java.util.function.Function;

public class PersonConstructorExample {
    public static void main(String[] args) {

        Function<String, Person> personCreator = Person::new;

        Person alice = personCreator.apply("Alice");

        System.out.println(alice.getName());
    }
}
