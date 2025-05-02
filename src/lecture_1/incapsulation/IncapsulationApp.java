package lecture_1.incapsulation;

public class IncapsulationApp {
    private int a1;
    public int a2;
    protected int a3;
    int a4;


    public static void main(String[] args) {
        IncapsulationApp incapsulationApp = new IncapsulationApp();
        int a5 = incapsulationApp.a1;
        int a6 = incapsulationApp.a2;
        int a7 = incapsulationApp.a3;
        int a8 = incapsulationApp.a4;
    }
}
