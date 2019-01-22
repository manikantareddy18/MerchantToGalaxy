package com.thought.Rules;

import java.util.ArrayList;

/*iterator pattern this is to apply all the rules on the given string*/
public class RulesApplier {
public boolean apply(String resp){
	boolean rulesFlag=false;
	Rules ru;
	ArrayList<Rules> arr=new ArrayList<>();
	arr.add(new RomanRulesOne());
	arr.add(new RomanRuleTwo());
	arr.add(new RomanRuleThree());
	
	for(int i=0;i<arr.size();i++) {
		if(rulesFlag ==false) {
			rulesFlag=arr.get(i).applyRule(resp);}
		else {
			System.out.print("failed for the Rule"+ i +" for ");
			break;
		}
	}
	return rulesFlag;
} 
	
	
}
