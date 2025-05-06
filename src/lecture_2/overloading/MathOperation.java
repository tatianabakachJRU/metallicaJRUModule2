package lecture_2.overloading;

public class MathOperation {
    int operation(int a, int b){
        return a + b;
    }
    // количество параметров
    int operation(int a, int b, int c){
        return a + b + c;
    }

    // тип параметров
    double operation(double a, int b){
        return a + b;
    }

    // порядок параметров
    double operation(int a, double b){
        return a + b;
    }

}
