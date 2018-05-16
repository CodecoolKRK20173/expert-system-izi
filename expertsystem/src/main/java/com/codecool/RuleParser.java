package com.codecool;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class RuleParser extends XMLParser {


    public RuleRepository ruleRepository;


    public RuleParser() {
        this.ruleRepository = new RuleRepository();
    }


    public void getRuleRepository() {
        RuleRepository ruleRepository = new RuleRepository();
        super.loadXmlDocument("Rules.xml");

        NodeList questionList = doc.getElementsByTagName("Rule");

        for (int i = 0; i < questionList.getLength(); i++) {
            Node node = questionList.item(i);

            Element ruleElement = (Element) node;
            NodeList questionNodeList = ruleElement.getElementsByTagName("Question");
            System.out.println("id = " + ((Element) node).getAttribute("id"));
            System.out.println("question = " + questionNodeList.item(0).getTextContent());

            // create question
            String id = ((Element) node).getAttribute("id");
            String questionString = questionNodeList.item(0).getTextContent();
            Answer answer = new Answer();

//            Value singleValue = new SingleValue()
//            answer.addValue();
//            ruleRepository.addQuestion(question);
        }
    }
}