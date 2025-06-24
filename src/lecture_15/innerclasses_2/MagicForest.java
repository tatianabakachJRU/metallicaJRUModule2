package lecture_15.innerclasses_2;

public class MagicForest {

    class Fairy{
        private String name = "Фея";

        void methodInnerClass(){
            System.out.println("Метод внутреннего класса");
        }
    }

    void methodOuterClass(){
        Fairy fairy = new Fairy();
        System.out.println("Название феи " + fairy.name);
        fairy.methodInnerClass();
    }

}
