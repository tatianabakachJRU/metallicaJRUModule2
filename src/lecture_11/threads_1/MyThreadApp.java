package lecture_11.threads_1;

public class MyThreadApp {
    public static void main(String[] args) {
        // Поток MyThread
        MyThread myThread = new MyThread();
        myThread.start();

        // Поток RunnableThread
        Thread runnableThread = new Thread(new RunnableThread());
        runnableThread.start();

        // Поток Main
        for (int i = 0; i < 5; i++) {
            System.out.println("Цикл в потоке Main: " + i);
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
