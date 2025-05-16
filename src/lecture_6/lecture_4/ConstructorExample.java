package lecture_6.lecture_4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ConstructorExample {
    public static void main(String[] args) {

        Supplier<List<String>> listSupplier = ArrayList::new;

        List<String> myList = listSupplier.get();
        myList.add("Hello");
        myList.add("Metallica");

        myList.forEach(System.out::println);
    }
}
