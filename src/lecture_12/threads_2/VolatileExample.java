package lecture_12.threads_2;

public class VolatileExample {

    private volatile boolean flag = true;

    private volatile int counter = 0;

    public void methodForDemoVolatile(){

        Thread thread1 = new Thread(() ->
        {
            for (int i = 0; i < 10000; i++) {
                flag = !flag;
                counter++;
            }
        });

        Thread thread2 = new Thread(() ->
        {
            for (int i = 0; i < 10000; i++) {
                flag = !flag;
                counter++;
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Флаг: " + flag);
        System.out.println("Счетчик: " + counter);
    }

    public static void main(String[] args) {
        VolatileExample volatileExample = new VolatileExample();
        volatileExample.methodForDemoVolatile();
    }
}
