package lecture_2.assotciation.composition;

public class Car {

    private Engine engine;

    public Car(String engineName) {
        this.engine = new Engine(engineName);
    }

    public Engine getEngine() {
        return engine;
    }

    public void info(){
        System.out.println("Двигатель: " + engine.getName());
    }
}
