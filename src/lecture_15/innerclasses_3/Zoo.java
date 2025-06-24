package lecture_15.innerclasses_3;

public class Zoo {

    void zooMethod(){
        System.out.println("Метод из Zoo");
    }

    public class Animal{
        static int staticVar = 10;

        private static void staticMethodInnerClass(){

        }

        void zooMethod(){
            System.out.println("Метод из Animal");
        }

        void animalMethod(){
            zooMethod();
            // 1. лучшая читаемость
            Zoo.this.zooMethod();
            this.animalMethod();
        }


    }

    static void staticMethodOuterClass(){
        System.out.println(Animal.staticVar);
        //Animal animal = new Animal();
    }
}
