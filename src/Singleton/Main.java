package Singleton;

public class Main {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getSingleton();
        singleton.setName("Juan");
        System.out.println("name "+ singleton.getName() + " memoria " + singleton);


        Singleton singleton1 = Singleton.getSingleton();
        System.out.println("name "+ singleton1.getName() + " memoria " + singleton1);


    }
}