package com.codecool.Iterators;

import com.codecool.Question;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;


public class QuestionIterator implements Iterator<Question> {
    private int index;
    private List<Question> questions;


    public QuestionIterator(ArrayList<Question> questions) {
        this.index = 0;
        this.questions = questions;
    }


    @Override
    public boolean hasNext() {
        return index < questions.size();
    }


    @Override
    public Question next() {
        return questions.get(this.index++);
    }
}