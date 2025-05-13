package lecture_5.generics_1;

import java.util.List;

public class Box<T> {
    private T item;

    public void put(T item){
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
