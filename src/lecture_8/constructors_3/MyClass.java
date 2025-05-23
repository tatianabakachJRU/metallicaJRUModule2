package lecture_8.constructors_3;

public class MyClass {
    static int staticField;

    static {
        staticField = 10;
        System.out.println("Static block 1, staticField =" + staticField);
    }

    static {
        System.out.println("Static block 2");
        staticField += 5;
    }

    static int secondStaticField = 20;

}
