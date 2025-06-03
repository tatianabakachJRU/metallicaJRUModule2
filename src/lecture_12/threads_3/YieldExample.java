package lecture_12.threads_3;

public class YieldExample implements Runnable {
    private String name;
    private boolean useYield;

    public YieldExample(String name, boolean useYield) {
        this.name = name;
        this.useYield = useYield;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + " выполняется шаг: " + i);
            if (useYield){
                Thread.yield();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
