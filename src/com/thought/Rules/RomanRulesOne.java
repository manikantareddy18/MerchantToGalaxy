package com.thought.Rules;

public class RomanRulesOne  implements Rules {



	//1 st rule 
	public boolean isNumberThrice(String value){
		String[] tokens=value.split(" ");
		boolean res=false;
		int ICounter=0;
		int XCounter=0;
		int CCounter=0;
		int MCounter=0;
		String PrevTok = "";
		for(String tok:tokens) {
			if(tok.equals("I")) {
				if(PrevTok.equals(tok))		{
					ICounter++;
				}
				else		{
					ICounter=0;
				}
				PrevTok=tok;

			}
			else if(tok.equals("X")) {
				if(PrevTok.equals(tok))		{
					XCounter++;
				}
				else		{
					XCounter=0;
				}
				PrevTok=tok;

			}
			else if(tok.equals("C")) {
				if(PrevTok.equals(tok))		{
					CCounter++;
				}
				else		{
					CCounter=0;
				}
				PrevTok=tok;

			}
			else if(tok.equals("M")) {
				if(PrevTok.equals(tok))		{
					MCounter++;
				}
				else		{
					MCounter=0;
				}
				PrevTok=tok;

			}
			else if(tok.equals("D")) {
				if(PrevTok.equals(tok))		{
					res=true;
					break;
				}

			}
			else if(tok.equals("L")) {
				if(PrevTok.equals(tok))		{
					res=true;
					break;

				}
			}
			else if(tok.equals("C")) {
				if(PrevTok.equals(tok))		{
					res=true;
					break;


				}

			}

			if(MCounter >3 || ICounter >3||CCounter >3||XCounter >3) {
				res=true;
				break;
			}
		}

		return res;
	}

	@Override
	public boolean applyRule(String value) {
		boolean res= isNumberThrice(value);
		return res;
	}
	
}
