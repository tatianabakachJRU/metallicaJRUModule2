package lecture_13.patternfabmet;

public class HighPriorityTask implements Task{
    @Override
    public void execute() {
        System.out.println("Высокоприоритетная задача");
    }
}
