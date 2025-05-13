package lecture_5.generics_6;

import java.util.ArrayList;

class Zoo<T> {
    Class<T> clazz;
    ArrayList<T> animals = new ArrayList<T>();

    Zoo(Class<T> clazz) {
        this.clazz = clazz;
    }

    public T createNewAnimal() throws InstantiationException, IllegalAccessException {
        T animal = clazz.newInstance(); // new T()
        animals.add(animal);
        return animal;
    }
}