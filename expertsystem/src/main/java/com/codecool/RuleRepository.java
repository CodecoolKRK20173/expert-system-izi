package com.codecool;


import com.codecool.Iterators.QuestionIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class RuleRepository {
    private List<Question> questions;
    private Iterator<Question> questionIterator;


    public RuleRepository() {
        this.questions = new ArrayList<>();
        this.questionIterator = new QuestionIterator((ArrayList<Question>) questions);
    }


    public void addQuestion(Question question) {
        questions.add(question);
    }


    public Iterator<Question> getIterator() {

        QuestionIterator qi = new QuestionIterator((ArrayList<Question>) questions);


        return this.questionIterator;
    }


    public List<Question> getQuestions() { return this.questions; }

}
