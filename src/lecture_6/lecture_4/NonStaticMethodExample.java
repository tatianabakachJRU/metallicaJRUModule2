package lecture_6.lecture_4;

import java.util.function.Consumer;

public class NonStaticMethodExample {
    void printMessage(String message){
        System.out.println(message);
    }

    public static void main(String[] args) {
        NonStaticMethodExample nonStaticMethodExample = new NonStaticMethodExample();
        Consumer<String> printMessage = nonStaticMethodExample::printMessage;

        printMessage.accept("Hello");
    }
}
