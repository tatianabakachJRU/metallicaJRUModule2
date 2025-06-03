package lecture_12.threads_1;

public class Counter {
    private int count = 0;

    // синхронизированный метод
    public synchronized void increment(){
        count++;
    }

    public synchronized void decrement(){
        count--;
    }

    public void safeIncrement(){
        //System.out.println("Это метод safeIncrement");

        //синхронизированный блок кода
        synchronized (this){
            count++;
        }
    }

    private final Object lock = new Object();

    public void safeDecrement(){
        //System.out.println("Это метод safeDecrement");

        synchronized (lock){
            count--;
        }
    }

    private static int staticCount = 0;

    public static synchronized void staticIncrement(){
        staticCount++;
    }

    public static synchronized void safeStaticIncrement(){
        //System.out.println("Это метод safeStaticIncrement");
        synchronized (Counter.class) {
            staticCount++;
        }
    }

    public int getCount() {
        return count;
    }

    public static int getStaticCount() {
        return staticCount;
    }
}
