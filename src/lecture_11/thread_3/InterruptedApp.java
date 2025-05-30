package lecture_11.thread_3;

public class InterruptedApp {
    public static void main(String[] args) {
        InterruptedThread interruptedThread = new InterruptedThread();
        InterruptedThread interruptedThread2 = new InterruptedThread();
        interruptedThread.start();
        interruptedThread2.start();

        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        interruptedThread.interrupt();

        System.out.println("Поток main завершил выполнение");
    }
}
