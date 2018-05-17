package com.codecool;


public class Question {

    private String id;
    private String question;
    private Answer answer;

    Question(String id, String question, Answer answer) {
        this.id = id;
        this.question = question;
        this.answer = answer;
    }


    Boolean getEvaluatedAnswer(String input) {
        try {
            return answer.evaluateAnswerByInput(input);

        } catch (IllegalArgumentException e) {
            System.out.println("SORRY TRY AGAIN");
        }

        return null;
    }


    String getId() {
        return this.id;
    }


    String getQuestion() {
        return this.question;
    }


    @Override
    public String toString() {
        return (id + " " + question + " " + answer.toString());
    }
}