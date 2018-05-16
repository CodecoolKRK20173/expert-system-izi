package com.codecool;

public class Question{

    String id;
    String question;
    Answer answer;

    Question(String id, String question, Answer answer){
        this.id = id;
        this.question = question;
        this.answer = answer;
    }

    public boolean getEvaluatedAnswer(String input){
        return answer.evaluateAnswerByInput(input);
    }
}