package lecture_14.threadfactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadFactoryExample {
    public static void main(String[] args) throws InterruptedException {
        CustomThreadFactory customThreadFactory = new CustomThreadFactory(8);

        ExecutorService executorService = Executors.newFixedThreadPool(3, customThreadFactory);

        for (int i = 0; i < 5; i++) {
            final int taskId = i;
            // чтобы увидеть исключение
            // тут надо было использовать метод execute() вместо метода submit()
            // т.к.при использовании execute(), если в задаче возникает непойманное исключение,
            // оно передаётся в UncaughtExceptionHandler потока(что я и хотела вам показать)
            // в методе же submit(), если задача выбрасывает исключение,
            // оно не проваливается в UncaughtExceptionHandler, а сохраняется внутри Future
            // и его надо будем потом оттуда доставать с помощью future.get() иначе оно потеряется
            executorService.execute(() -> {
                if (taskId == 3) {
                    throw new RuntimeException("Ошибка в задаче номер: " + taskId);
                }
                System.out.println("Выполняется задача " + taskId
                        + " в потоке " + Thread.currentThread().getName()
                        + " приоритет " + Thread.currentThread().getPriority());

            });
        }
        executorService.shutdown();
    }

}
