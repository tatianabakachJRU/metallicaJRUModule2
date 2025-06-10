package lecture_13.daemon;

public class DaemonExample {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(new DaemonThread());
        daemonThread.setDaemon(true);
        daemonThread.start();

//        Thread thread = new Thread(new DaemonThread());
//        thread.start();

        System.out.println("Основной поток завершен.");

    }
}
