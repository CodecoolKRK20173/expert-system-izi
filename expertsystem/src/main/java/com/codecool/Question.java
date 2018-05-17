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

    public Boolean getEvaluatedAnswer(String input)
    {
        try {
            return answer.evaluateAnswerByInput(input);
        } catch (IllegalArgumentException e){
        }
        return null;
    }


    public String getId() {
        return this.id;
    }


    public String getQuestion() {
        return this.question;
    }


    public Answer getAnswer() {
        return this.answer;
    }


    @Override
    public String toString() {
        return (id + " " + question + " " + answer.toString());
    }
}