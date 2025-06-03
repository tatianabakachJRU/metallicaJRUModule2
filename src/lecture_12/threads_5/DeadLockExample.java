package lecture_12.threads_5;

public class DeadLockExample {

    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void methodDemoDeadLock1(){
        synchronized (lock1){
            System.out.println("lock1 получен, жду получения lock2");
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (lock2){
                System.out.println("lock2 получен");
            }
        }
    }

    public void methodDemoDeadLock2(){
        synchronized (lock2){
            System.out.println("lock2 получен, жду получения lock1");

            synchronized (lock1){
                System.out.println("lock1 получен");
            }
        }
    }
}
