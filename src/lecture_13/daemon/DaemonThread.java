package lecture_13.daemon;

public class DaemonThread implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("Поток демон работает..." + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Поток демон прерван");
            }
        }
    }
}
