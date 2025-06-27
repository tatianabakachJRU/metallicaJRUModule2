package lecture_17.reflection_2;

public class Cat {
    private String name;

    public Cat() {
        this.name = "Барсик";
    }

    public Cat(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
