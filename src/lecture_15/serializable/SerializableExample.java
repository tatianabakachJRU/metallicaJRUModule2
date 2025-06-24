package lecture_15.serializable;

import java.io.*;

public class SerializableExample {
    public static void main(String[] args) {
        //serializePerson();
        deserializePerson();
    }

    public static void serializePerson(){
        Person alice = new Person("Alice", 30);

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("person.ser"))) {

            objectOutputStream.writeObject(alice);
            System.out.println("Объект сериализован и сохранен в person.ser");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deserializePerson(){

        try(ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("person.ser"))){

            Person person = (Person) objectInputStream.readObject();
            System.out.println("Объект десериализован");
            System.out.println("Имя: " + person.getName() + " Возраст: " + person.getAge());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
