package lecture_5.generics_6;

public class ZooApp {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Zoo<Tiger> zoo = new Zoo<Tiger>(Tiger.class); // вот тут передается тип!
        Tiger tiger = zoo.createNewAnimal();
    }
}
