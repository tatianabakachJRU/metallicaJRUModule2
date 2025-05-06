package lecture_2.abstractuion;

public abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract Animal getAnimal();

    public Animal(String name) {
        this.name = name;
    }

    protected abstract void sound();

    void info(){
        System.out.println("Это животное: " + name);
    }
}
