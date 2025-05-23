package lecture_8.statics_3;

public class OuterInnerApp {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.print();
    }
}
