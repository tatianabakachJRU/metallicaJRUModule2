package lecture_8.statics_1;

public class CounterApp {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();

        System.out.println("Count: " + Counter.count);
    }
}
