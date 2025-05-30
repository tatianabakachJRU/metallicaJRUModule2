package lecture_11.thread_4;

public class InterruptThreadExample {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() ->
        {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Поток работает...");
            }
            System.out.println("Поток завершен");
        });
        thread.start();




        Thread.sleep(2);

        thread.interrupt();


    }
}
