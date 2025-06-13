package lecture_14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandomExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int catId = 1; catId <= 10; catId++) {
            final int finalCatId = catId;
            executorService.submit(()->{
                ThreadLocalRandom random = ThreadLocalRandom.current();
                int foodAmount = random.nextInt(50, 201);
                System.out.println("Повар: " + Thread.currentThread().getName() +
                        " накормил кота: " + finalCatId +
                        " порцией:" + foodAmount);

            });
        }
        executorService.shutdown();
    }
}
