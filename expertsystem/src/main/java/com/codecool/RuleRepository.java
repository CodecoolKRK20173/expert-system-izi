package com.codecool;

import com.codecool.Iterators.QuestionIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


class RuleRepository {
    private List<Question> questions;
    private Iterator<Question> questionIterator;


    RuleRepository() {
        this.questions = new ArrayList<>();
        this.questionIterator = new QuestionIterator((ArrayList<Question>) questions);
    }


    void addQuestion(Question question) {
        questions.add(question);
    }


    Iterator<Question> getIterator() {
        return this.questionIterator;
    }
}
