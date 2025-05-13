package lecture_5.generics_3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Example {
    public static<T extends Number & Comparable<T>> void print(List<T> numbers){
        for (T number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Double> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();

        print(list1);
        print(list2);
        //print(list3);

    }
}
