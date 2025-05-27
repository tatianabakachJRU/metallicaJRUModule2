package lecture_9.clone;

public class PersonApp {
    public static void main(String[] args) {
        try{
            Person andy = new Person("Andy", 30);
            Person clone = andy.clone();
            System.out.println(andy);
            System.out.println(clone);


            andy.setAge(50);
            System.out.println(andy);
            System.out.println(clone);

            andy.setName("Viktor");
            System.out.println(andy);
            System.out.println(clone);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
