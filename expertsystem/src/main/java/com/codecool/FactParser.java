package com.codecool;

public class FactParser extends XMLParser {


    FactRepository factRepository;


    public FactParser(String xmlPath) {
        this.factRepository = new FactRepository();
        loadXmlDocument(xmlPath);
    }


    public FactRepository getFactRepository() {

    }

}
