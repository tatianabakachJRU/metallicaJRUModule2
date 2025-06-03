package lecture_12.threads_5;

public class DeadLockExampleApp {
    public static void main(String[] args) {
        DeadLockExample deadLockExample = new DeadLockExample();
        Thread thread1 = new Thread(deadLockExample::methodDemoDeadLock1);
        Thread thread2 = new Thread(deadLockExample::methodDemoDeadLock2);
        thread1.start();
        thread2.start();
    }
}
