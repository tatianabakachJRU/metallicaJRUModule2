package lecture_13.priority;

public class PriorityRunnable implements Runnable {

    private int priority;

    public PriorityRunnable(int priority) {
        this.priority = priority;
    }

    @Override
    public void run() {
        System.out.println("Поток с приоритетом " + priority + " запущен");

        for (int i = 0; i < 5; i++) {
            System.out.println("Поток с приоритетом " + priority + " " + "i: " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Поток прерван");
            }
        }
    }
}
