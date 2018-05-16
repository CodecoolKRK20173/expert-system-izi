package com.codecool;

import com.codecool.Iterators.QuestionIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class RuleRepository {
    private List<Question> questions;

    public RuleRepository() {
        this.questions = new ArrayList<>();
    }


    public void addQuestion(Question question) {
        questions.add(question);
    }


    public Iterator<Question> getIterator() {
        return new QuestionIterator(this.questions);
    }


    public List<Question> getQuestions() { return this.questions; }

}