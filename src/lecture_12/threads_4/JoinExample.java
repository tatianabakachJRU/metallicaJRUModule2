package lecture_12.threads_4;

public class JoinExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() ->
        {
            for (int i = 0; i < 5; i++) {
                System.out.println("Итерация цикла: " + i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread.start();

        try {
            thread.join(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if(thread.isAlive()){
            System.out.println("Поток все еще выполняется");
        } else {
            System.out.println("Поток завершился");
        }
    }

}
