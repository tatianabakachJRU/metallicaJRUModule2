package lecture_6.lambda_1;

@FunctionalInterface
public interface MyFunctionalInterface {
    void execute();

    default void defaultExecute(){

    }
}
