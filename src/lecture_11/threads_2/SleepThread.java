package lecture_11.threads_2;

public class SleepThread implements Runnable{
    @Override
    public void run() {
        try{
            someMethod();
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

    public static void someMethod() throws InterruptedException {
        Thread.sleep(1000);
    }

}
