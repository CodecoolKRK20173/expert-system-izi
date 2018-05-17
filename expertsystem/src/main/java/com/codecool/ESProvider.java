package com.codecool;

import java.util.*;

public class ESProvider {

    private FactRepository factRepository;
    private RuleRepository ruleRepository;
    private Map<String, Boolean> answers;


    
    public ESProvider(FactParser factParser, RuleParser ruleParser) {
        this.factRepository = factParser.getFactRepository();
        this.ruleRepository = ruleParser.getRuleRepository();
    }


    public void collectAnswers() {
        Iterator<Question> questionIterator = ruleRepository.getIterator();
        Question question;
        this.answers = new HashMap<>();




        while (questionIterator.hasNext()) {
            question = questionIterator.next();
            question = questionIterator.next();
//            System.out.println(questionIterator.next().getQuestion());


            boolean x = false;

            while(!x){
                System.out.println(question.getQuestion());
                String userInput = getUserAnswer();
                Boolean answ = question.getEvaluatedAnswer(userInput);
                if(answ != null){
                    x=true;
                    this.answers.put(question.getId(), question.getEvaluatedAnswer(userInput));
                }

            }
        }

        System.out.println(answers);
    }


    public String getUserAnswer() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void evaluate() {
        Iterator<Fact> factIterator = this.factRepository.getIterator();
        while (factIterator.hasNext()) {
            Fact fact = factIterator.next();
            Set<String> factIdsSet = fact.getSetId();

            for (String id : factIdsSet) {
                if (this.answers.get(id).equals(fact.getValueById(id)))
                    System.out.println(fact.getDescription());
            }
        }
    }
}
