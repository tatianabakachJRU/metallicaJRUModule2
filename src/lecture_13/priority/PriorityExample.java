package lecture_13.priority;

public class PriorityExample {
    public static void main(String[] args) {
        Thread maxPriority = new Thread(new PriorityRunnable(Thread.MAX_PRIORITY));
        Thread normPriority = new Thread(new PriorityRunnable(Thread.NORM_PRIORITY));
        Thread minPriority = new Thread(new PriorityRunnable(Thread.MIN_PRIORITY));

        maxPriority.setPriority(Thread.MAX_PRIORITY);
        normPriority.setPriority(Thread.NORM_PRIORITY);
        minPriority.setPriority(Thread.MIN_PRIORITY);

        maxPriority.start();
        normPriority.start();
        minPriority.start();


    }
}
