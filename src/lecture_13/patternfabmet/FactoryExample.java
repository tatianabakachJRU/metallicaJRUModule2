package lecture_13.patternfabmet;

public class FactoryExample {
    public static void main(String[] args) {
        Task high = TaskFactory.createTask("high");
        Task norm = TaskFactory.createTask("norm");
        Task low = TaskFactory.createTask("low");

        Thread thread1 = new Thread(high::execute);
        Thread thread2 = new Thread(norm::execute);
        Thread thread3 = new Thread(low::execute);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
