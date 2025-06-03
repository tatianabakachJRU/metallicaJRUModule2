package lecture_12.threads_3;

public class YieldExampleApp {
    public static void main(String[] args) {
        Thread thread1 =
                new Thread(new YieldExample("Поток 1 (с yield)", true));

        Thread thread2 =
                new Thread(new YieldExample("Поток 2 (без yield)", false));

        thread1.start();
        thread2.start();
    }
}
