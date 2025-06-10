package lecture_13.callablefuture;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableFutureExample {
    public static void main(String[] args) {
        Callable<String> task = new Callable<String>(){
            @Override
            public String call() throws Exception {
                Thread.sleep(1000);
                return "Задача завершена";
            }
        };
        FutureTask<String> futureTask = new FutureTask<>(task);
        Thread thread = new Thread(futureTask);
        thread.start();

        try{
            String result = futureTask.get();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
