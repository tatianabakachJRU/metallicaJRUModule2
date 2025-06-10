package lecture_13.patternfabmet;

public class TaskFactory {
    public static Task createTask(String type){
        if (type.equalsIgnoreCase("high")){
            return new HighPriorityTask();
        } else if (type.equalsIgnoreCase("norm")){
            return new NormPriorityTask();
        } else if (type.equalsIgnoreCase("low")){
            return new LowPriorityTask();
        }
        return null;
    }
}
