package com.codecool;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.Arrays;


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
            Element rule = (Element) questionList.item(i);

            Element ruleElement = (Element) node;
            NodeList questionNodeList = ruleElement.getElementsByTagName("Question");
            System.out.println("id = " + ((Element) node).getAttribute("id"));
            System.out.println("question = " + questionNodeList.item(0).getTextContent());


            //create answer//////////////

            Answer answer = new Answer();
            Element answerTag = (Element) rule.getElementsByTagName("Answer").item(0);
            NodeList selectionValues = answerTag.getElementsByTagName("Selection");
            for (int j = 0; j < selectionValues.getLength(); j++) {
                Element selection = (Element) selectionValues.item(j);
                boolean selectionValue = Boolean.valueOf(selection.getAttribute("value"));

                NodeList answerValues = selection.getChildNodes();
                for (int k = 0; k < answerValues.getLength(); k++) {
                    Node answerNode = answerValues.item(k);
                    Element answerValue = (Element) answerNode;
                    String valueType = answerValue.getTagName();

                    if (valueType.equals("SingleValue")) {
                        answer.addValue(new SingleValue(answerValue.getAttribute("value"), selectionValue));
                    } else if (valueType.equals("MultipleValue")) {
                        String[] values = answerValue.getAttribute("value").split(", ");
                        answer.addValue(new MultipleValue(Arrays.asList(values), selectionValue));
                    }








            // create question
            String id = ((Element) node).getAttribute("id");
            String questionString = questionNodeList.item(0).getTextContent();

            Question question = new Question(id, questionString, answer);
        }
    }
}