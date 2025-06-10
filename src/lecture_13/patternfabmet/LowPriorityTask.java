package lecture_13.patternfabmet;

public class LowPriorityTask implements Task{

    @Override
    public void execute() {
        System.out.println("Низкоприоритетная задача");
    }
}
