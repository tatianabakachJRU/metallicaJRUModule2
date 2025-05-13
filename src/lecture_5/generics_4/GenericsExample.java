package lecture_5.generics_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsExample {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<?> list1 = new ArrayList<>();
        //list1.add("Hello");

        List<Integer> integerList =List.of(1, 2, 3);
        List<Double> doubleList =List.of(1.5, 2.7, 3.8);

        printNumbers(integerList);
        printNumbers(doubleList);

    }

    // в этот лист нельзя добавлять элементы, т.к. не известен конкретный тип параметр
    public static void printNumbers(List<? extends Number> list){
        for (Number number : list) {
            System.out.println(number);
        }
    }

    // из этого листа нельзя вычитывать элементы конкретного типа(кроме Object),
    // т.к. не известен конкретный тип параметр
    public static void addIntegers(List<? super Integer> list){
        list.add(1);
    }
}
