package com.codecool;


import java.util.ArrayList;
import java.util.List;

public class SingleValue extends Value{

    public SingleValue(String param, boolean selectionType){
        List<String> params = new ArrayList<>();
        params.add(param);
        super.selectionType = selectionType;
    }

}