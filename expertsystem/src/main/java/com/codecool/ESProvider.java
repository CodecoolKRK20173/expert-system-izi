package com.codecool;

import java.util.*;


class ESProvider {

    private FactRepository factRepository;
    private RuleRepository ruleRepository;
    private Map<String, Boolean> answers;


    ESProvider(FactParser factParser, RuleParser ruleParser) {
        this.factRepository = factParser.getFactRepository();
        this.ruleRepository = ruleParser.getRuleRepository();
    }


    void collectAnswers() {
        Iterator<Question> questionIterator = ruleRepository.getIterator();
        Question question;
        this.answers = new HashMap<>();

        while (questionIterator.hasNext()) {
            question = getQuestion(questionIterator);

            boolean isAnswerCorrect = false;

            while (!isAnswerCorrect) {
                System.out.println(question.getQuestion());
                String userInput = getUserAnswer();
                Boolean evaluatedAnswer = question.getEvaluatedAnswer(userInput);

                if (evaluatedAnswer != null) {
                    isAnswerCorrect = true;
                    this.answers.put(question.getId(), question.getEvaluatedAnswer(userInput));
                }
            }
        }

        System.out.println(answers);
    }


    private Question getQuestion(Iterator<Question> questionIterator) {
        Question question;
        question = questionIterator.next();
        question = questionIterator.next();

        return question;
    }


    private String getUserAnswer() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


    void evaluate() {
        Iterator<Fact> factIterator = this.factRepository.getIterator();
        boolean isMatch = false;

        while (factIterator.hasNext()) {
            Fact fact = factIterator.next();
            Set<String> factIdsSet = fact.getSetId();
            int matches = 0;

            for (String id : factIdsSet) {
                if (this.answers.get(id).equals(fact.getValueId().get(id)))
                    matches++;
            }

            if (matches == factIdsSet.size()) {
                isMatch = true;
                System.out.println(fact.getDescription());
            }
        }

        if (!isMatch)
            System.out.println("Match not found");
    }
}
