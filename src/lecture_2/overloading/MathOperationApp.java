package lecture_2.overloading;

public class MathOperationApp {
    public static void main(String[] args) {
        MathOperation mathOperation = new MathOperation();
        int operation = mathOperation.operation(2, 4);
        double operation1 = mathOperation.operation(2.14, 4);
    }
}
