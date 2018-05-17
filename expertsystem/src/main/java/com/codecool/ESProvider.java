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

            boolean isAnswerCorrect = false;

            while(!isAnswerCorrect) {
                System.out.println(question.getQuestion());
                String userInput = getUserAnswer();
                Boolean evaluatedAnswer = question.getEvaluatedAnswer(userInput);

                if(evaluatedAnswer != null){
                    isAnswerCorrect = true;
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
            int matches = 0;

            for (String id : factIdsSet) {
                if (this.answers.get(id).equals(fact.getValueId().get(id)))
                    matches++;
            }

            if(factIdsSet.size() == 3)
                System.out.println(fact.getDescription());
        }
    }
}
