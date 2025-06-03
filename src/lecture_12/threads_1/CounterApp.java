package lecture_12.threads_1;

public class CounterApp {
    public static void main(String[] args) {
        Counter counter = new Counter();
        
        Thread thread1 = new Thread(() ->
        {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
                counter.safeIncrement();
                Counter.staticIncrement();
            }
        });

        Thread thread2 = new Thread(() ->
        {
            for (int i = 0; i < 1000; i++) {
                counter.decrement();
                counter.safeDecrement();
                Counter.safeStaticIncrement();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
        System.out.println("Final static count: " + Counter.getStaticCount());

    }
}
