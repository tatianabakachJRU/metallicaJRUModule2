package lecture_6.lecture_4;

import java.util.concurrent.Flow;
import java.util.function.Consumer;

public class StaticMethodExample {
    static void printMessage(String message){
        System.out.println(message);
    }

    public static void main(String[] args) {
        Consumer<String> printMessage = StaticMethodExample::printMessage;
        //Consumer<String> printMessage = message -> printMessage(message);
//        Consumer<String> printMessage = new Consumer<String>() {
//            @Override
//            public void accept(String string) {
//                printMessage(string);
//            }
//        };


        printMessage.accept("Hello");

    }
}
