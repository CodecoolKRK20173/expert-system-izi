package com.codecool;

import java.util.ArrayList;
import java.util.List;


class SingleValue extends Value {
    SingleValue(String param, boolean selectionType) {
        super(selectionType);
        List<String> params = new ArrayList<>();
        params.add(param);
        setInputPattern(params);
    }
}