package lecture_15.staticnestedclasses_1;

public class City {
    private String name;
    private static int count;

    static class Park{
        void parkMethod(){
            System.out.println("Я гуляю в парке");
            // есть доступ только к статическим членам внешнего класса
            System.out.println(count);
            //System.out.println(name);
        }
    }
}
