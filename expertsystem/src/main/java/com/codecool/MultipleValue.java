package com.codecool;

import java.util.Arrays;
import java.util.List;

public class MultipleValue extends Value {

    public MultipleValue(String params, boolean selectionType) {
        super(selectionType);
        setInputPattern(Arrays.asList(params.split(",")));

    }
}
