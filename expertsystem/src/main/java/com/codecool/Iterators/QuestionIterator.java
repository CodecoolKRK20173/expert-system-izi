package com.codecool.Iterators;

import com.codecool.Question;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QuestionIterator implements Iterator<Question> {

    private List<Question> rules;
    int indexPosition;


    public QuestionIterator(List<Question> rules) {
        this.rules = new ArrayList<>();
        this.indexPosition = 0;
    }


    @Override
    public boolean hasNext() {
        if(this.rules.size() != indexPosition)
            return true;

        this.indexPosition = 0;
        return false;
    }


    @Override
    public Question next() {
        return this.rules.get(indexPosition++);
    }
}