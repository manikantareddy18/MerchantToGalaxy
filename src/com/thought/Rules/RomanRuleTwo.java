package com.thought.Rules;

public class RomanRuleTwo implements Rules {

	@Override
	public boolean applyRule(String value) {
		// TODO Auto-generated method stub
		boolean result=isSubtractionRules(value);
		return result;
	}
	//In second rules we will call only next value is smaller than the existing
	public boolean isSubtractionRules(String value) {
		String[] tokens=value.split(" ");
		String PrevTok = null;
		boolean res=false;
		for(String tok:tokens) {
			if(tok.equals("V") || tok.equals("X")) {

				if(PrevTok!= null &&(!PrevTok.equals("I"))) {
					res=true;
					break;
				}

			}

			else if(tok.equals("L") || tok.equals("C")) {

				if(PrevTok!= null &&(!PrevTok.equals("X"))) {
					res=true;
					break;
				}

			}
			else if(tok.equals("D") || tok.equals("M")) {

				if(PrevTok!= null &&(!PrevTok.equals("C"))) {
					res=true;
					break;
				}

			}
			else if(tok.equals("V") || tok.equals("L")|| tok.equals("D")) {

					res=true;
					break;

			}
		}
return res;

	}

}
