package com.codecool;

public class Question {

    private String id;
    private String question;
    private Answer answer;

    public Question(String id, String question, Answer answer){
        this.id = id;
        this.question = question;
        this.answer = answer;
    }

    public boolean getEvaluatedAnswer(String input){
        return answer.evaluateAnswerByInput(input);
    }
}