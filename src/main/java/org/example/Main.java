package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Dog myDog = new Dog();
        myDog.setName("Lupe");
        myDog.setColor("Te con leche");
        myDog.setRace("Caniche");
        System.out.println(myDog.toString());
    }
}