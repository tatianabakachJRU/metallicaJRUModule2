package lecture_11.thread_3;

public class InterruptedThread extends Thread{
    @Override
    public void run() {
       try{

           for (int i = 0; i < 50; i++) {
               System.out.println("Поток выполняется: " + i);
               Thread.sleep(1000);
           }
       } catch (InterruptedException e) {
           e.printStackTrace();
           System.out.println("Поток был прерван!");
       }
        System.out.println("Поток завершил выполнение");
    }
}
