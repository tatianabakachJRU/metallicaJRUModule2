package lecture_6.lambda_1;

public class LambdaExample {
    public static void main(String[] args) {
        MyFunctionalInterface myFunctionalInterface
                //(параметр) -> тело лямбда выражения
                //execute() {System.out.println("Hello First Lambda")}
                = () -> System.out.println("Hello First Lambda");

        myFunctionalInterface.execute();
    }
}
