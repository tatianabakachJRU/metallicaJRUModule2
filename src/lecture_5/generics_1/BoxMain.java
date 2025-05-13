package lecture_5.generics_1;

import lecture_1.Cat;

public class BoxMain {
    public static void main(String[] args) {
        Box<String> box = new Box<>();

        box.put("Кот Матроскин");
        String item1 = (String)box.getItem();


        // ошибка компиляции
        //box.put(1);
        String item2 = (String)box.getItem();
    }
}
