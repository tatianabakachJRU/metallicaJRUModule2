package lecture_1.polymorphism;

public class MathUtils {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, int b) {
        return a + b;
    }

    public double add(int a, double b) {
        return a + b;
    }

    public String add(String a, int b) {
        return a + b;
    }
}
