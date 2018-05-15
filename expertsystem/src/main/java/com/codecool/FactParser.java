package com.codecool;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class FactParser extends XMLParser {


    FactRepository factRepository;
    Document doc;


    public FactParser(String xmlPath) {
        this.factRepository = new FactRepository();
        loadXmlDocument(xmlPath);
        this.doc = getDocument();
    }

    // FactRepository
    public void getFactRepository() {
        FactRepository fr = new FactRepository();

        NodeList nList = doc.getElementsByTagName("country");

        for (int temp = 0; temp < nList.getLength(); temp++) {

            Node nNode = nList.item(temp);

            System.out.println("\nCurrent Element :" + nNode.getNodeName());
            Element eElement = (Element) nNode;


            System.out.println("liq : " + eElement.getElementsByTagName("liquor").item(0).getTextContent());

            Fact fact = new Fact(nNode.getNodeName(),"dupa");
            boolean value = eElement.getElementsByTagName("liquor").item(0).getTextContent();
            fact.setFactValueById("cheap", );
            fact.set

        }

    }
}
