package lecture_14.threadfactory;

import java.util.concurrent.ThreadFactory;

public class CustomThreadFactory implements ThreadFactory {
    private int threadCount = 1;
    private int threadPriority;

    public CustomThreadFactory(int threadPriority) {
        this.threadPriority = threadPriority;
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setName("Worker Thread-" + threadCount++);
        thread.setPriority(threadPriority);
        thread.setUncaughtExceptionHandler((t, e) ->{
            System.err.println("Поток " + t.getName()
                    + " прервался с ошибкой: " + e.getMessage());
        });
        return thread;
    }
}
