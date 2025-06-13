package lecture_14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadExecutorExample {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            final int taskId = i;
            executorService.submit(()->{
                System.out.println("Task " + taskId
                        + " is running in " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Task " + taskId
                        + " is completed in " + Thread.currentThread().getName());
            });
        }
        executorService.shutdown();
    }
}
