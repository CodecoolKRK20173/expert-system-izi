package com.codecool;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


class RuleParser extends XMLParser {


    private RuleRepository ruleRepository;


    RuleParser() {
        this.ruleRepository = new RuleRepository();
    }


    RuleRepository getRuleRepository() {
        RuleRepository ruleRepository = new RuleRepository();
        super.loadXmlDocument("Rules.xml");
        NodeList questionList = doc.getElementsByTagName("Rule");

        for (int i = 0; i < questionList.getLength(); i++) {
            Node node = questionList.item(i);
            Element rule = (Element) questionList.item(i);
            Element ruleElement = (Element) node;
            NodeList questionNodeList = ruleElement.getElementsByTagName("Question");

            Answer answer = new Answer();
            Element answerTag = (Element) rule.getElementsByTagName("Answer").item(0);
            NodeList selectionValues = answerTag.getElementsByTagName("Selection");

            for (int j = 0; j < selectionValues.getLength(); j++) {
                Element selection = (Element) selectionValues.item(j);
                boolean selectionValue = Boolean.valueOf(selection.getAttribute("value"));
                NodeList answerValues = selection.getChildNodes();

                for (int k = 0; k < answerValues.getLength(); k++) {
                    Node answerNode = answerValues.item(k);

                    if (answerNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element answerElement = (Element) answerNode;

                        if (answerElement.getTagName().equals("SingleValue"))
                            answer.addValue(new SingleValue(answerElement.getAttribute("value"), selectionValue));
                        else
                            answer.addValue(new MultipleValue(answerElement.getAttribute("value"), selectionValue));
                    }
                }

                String id = ((Element) node).getAttribute("id");
                String questionString = questionNodeList.item(0).getTextContent();
                Question question = new Question(id, questionString, answer);
                ruleRepository.addQuestion(question);
            }
        }

        return ruleRepository;
    }
}