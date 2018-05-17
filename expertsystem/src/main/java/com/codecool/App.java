package com.codecool;


public class App {

    public static void main(String[] args) {
        ESProvider expertSystem = new ESProvider(new FactParser(), new RuleParser());
        expertSystem.collectAnswers();
        expertSystem.evaluate();
    }
}