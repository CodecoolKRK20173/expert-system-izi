package com.codecool;

public class App {

    public static void main(String[] args) {

        FactParser fp = new FactParser("Fact.xml");
        System.out.println("afuhuh");
        fp.getFactRepository();

        FactRepository fr = new FactRepository();
        fr.addFact();
    }
}