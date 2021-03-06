package com.codecool.Iterators;

import com.codecool.Fact;

import java.util.Iterator;
import java.util.List;


public class FactIterator implements Iterator<Fact> {

    private List<Fact> facts;
    private int indexPosition;


    public FactIterator(List<Fact> facts) {
        this.facts = facts;
        this.indexPosition = 0;
    }


    @Override
    public boolean hasNext() {
        if(this.facts.size() != indexPosition)
            return true;

        this.indexPosition = 0;
        return false;
    }


    @Override
    public Fact next() {
        return this.facts.get(indexPosition++);
    }
}
