package lecture_13.executorservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<Future<Integer>> futures = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            final int number = random.nextInt(100);
            Callable<Integer> task = () -> {
                System.out.println("Число: " + number
                        + " в потоке " + Thread.currentThread().getName());
                return number * number;
            };
            futures.add(executorService.submit(task));
        }

        for (Future<Integer> future : futures) {
            try {
                Integer result = future.get();
                System.out.println("Квадрат числа: " + result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();

    }
}
