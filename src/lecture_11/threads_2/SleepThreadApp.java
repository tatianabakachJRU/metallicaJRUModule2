package lecture_11.threads_2;

public class SleepThreadApp {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new SleepThread());
        thread1.start();

        Thread thread2 = new Thread(new SleepThread());
        thread2.start();

        Thread thread3 = new Thread(new SleepThread());
        thread3.start();

        try{
            SleepThread.someMethod();
            System.out.println("Поток: "
                    + Thread.currentThread().getName()
                    + " засыпает на 3 секунды");
            Thread.sleep(3000);
            System.out.println("Поток: "
                    + Thread.currentThread().getName()
                    + " проснулся");
        } catch (InterruptedException e) {
            System.out.println("Поток: "
                    + Thread.currentThread().getName()
                    + " был прерван");
        }
    }
}
