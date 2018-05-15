package com.codecool;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class FactParser extends XMLParser {


    public FactRepository factRepository;


    public FactParser(String xmlPath) {
        this.factRepository = new FactRepository();
    }


    public FactRepository getFactRepository() {

        //PARSING DOC INTO REPOSITORY
        FactRepository factRepository = new FactRepository();

        super.loadXmlDocument("Fact.xml");
        NodeList factList = doc.getElementsByTagName("Fact");

        for (int i = 0; i < factList.getLength(); i++) {

            Node node = factList.item(i);
            Element factElement = (Element) node;
            NodeList descList = factElement.getElementsByTagName("Description");
            Node descriptionNode = descList.item(0);
            Element descriptionElement = (Element) descriptionNode;
            String factId = factElement.getAttribute("id");
            String descriptionValue = descriptionElement.getAttribute("value");
            NodeList evalList = factElement.getElementsByTagName("Eval");
            Fact fact = new Fact(factId, descriptionValue);

            for (int k = 0; k < evalList.getLength(); k++){
                Node evalNode = evalList.item(k);
                Element evalElement = (Element) evalNode;
                String evalText = evalElement.getTextContent();
                String evalId = evalElement.getAttribute("id");
                Boolean value = Boolean.valueOf(evalText);

                fact.setFactValueById(evalId, value);
            }


            factRepository.addFact(fact);
        }

        return factRepository;
    }
}
