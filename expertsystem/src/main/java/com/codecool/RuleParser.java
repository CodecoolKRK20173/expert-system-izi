package com.codecool;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class RuleParser extends XMLParser {


    public RuleRepository ruleRepository;


    public RuleParser() {
        this.ruleRepository = new RuleRepository();
    }


    public FactRepository getRuleRepository() {
        RuleRepostiory ruleRepostiory = new RuleRepository();
        super.loadXmlDocument("Fact.xml");

    }