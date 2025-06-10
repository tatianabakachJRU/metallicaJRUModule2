package lecture_13.threadgroup_1;

public class ThreadGroupExample {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("MyThreadGroup");

        Thread thread1 = new Thread(group, new MyRunnable(), "MyThread-1");
        Thread thread2 = new Thread(group, new MyRunnable(), "MyThread-2");
        Thread thread3 = new Thread(group, new MyRunnable(), "MyThread-3");

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Group Name: " + group.getName());
        System.out.println("Parent: "
                + (group.getParent()!=null ? group.getParent() : "No Parent"));

        int activeCount = group.activeCount();
        System.out.println("Active Threads Count: " + activeCount);

        Thread[] threads = new Thread[activeCount];
        int enumerate = group.enumerate(threads);
        for (Thread thread : threads) {
            if(thread!=null){
                System.out.println("Thread " + thread.getName());
            }
        }

        group.setMaxPriority(7);

        System.out.println("Max Priority: " + group.getMaxPriority());

        //group.interrupt();
    }
}
