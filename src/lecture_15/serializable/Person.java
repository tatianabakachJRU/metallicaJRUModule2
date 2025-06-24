package lecture_15.serializable;

import java.io.Serializable;

public class Person implements Serializable {

    //private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private transient int number;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
