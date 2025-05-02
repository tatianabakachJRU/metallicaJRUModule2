package lecture_1.incapsulation;

public class PersonApp {
    public static void main(String[] args) {
        Person tatiana = new Person();
        tatiana.setName("Tatiana");
        tatiana.setAge(20);
        System.out.println(tatiana);

        Person petr = new Person("Petr", 27);
        petr.setAge(-43);
        System.out.println(petr);
    }
}
