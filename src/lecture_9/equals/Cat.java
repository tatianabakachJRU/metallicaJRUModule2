package lecture_9.equals;

import java.util.Objects;

public class Cat {
    // 1.рефлексивность x.equals(x) -> true
    // 2.симметричность если x.equals(y) -> true, то и y.equals(x) -> true
    // 3.транзитивность если x.equals(y) -> true и y.equals(z) -> true,
    // то и z.equals(x) -> true
    // 4.согласованность x.equals(y) -> true, если мы ничего не меняли,
    // то при повторном вызове, тоже должно быть true
    // 5.неприемлемость null x.equals(null) -> false

    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        //1
        if (this == o) return true;
        //2
        if (o == null || getClass() != o.getClass()) return false;
        //3
        Cat cat = (Cat) o;
        //4
        return name.equals(cat.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result;
        return result;
    }
}
