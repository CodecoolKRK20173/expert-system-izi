package com.codecool;

import java.util.Arrays;
import java.util.List;


class MultipleValue extends Value {

    MultipleValue(String params, boolean selectionType) {
        super(selectionType);
        setInputPattern(Arrays.asList(params.split(",")));

    }
}
