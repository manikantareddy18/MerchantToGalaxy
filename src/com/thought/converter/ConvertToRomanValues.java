package com.thought.converter;

import java.util.ArrayList;

import com.thought.Rules.RomanRuleThree;
import com.thought.Rules.RomanRuleTwo;
import com.thought.Rules.RomanRulesOne;
import com.thought.Rules.Rules;
import com.thought.Rules.RulesApplier;

public class ConvertToRomanValues implements Converter{
	Converter c;
	KeyTypes kt;
	ConvertToRomanValues(Converter c,KeyTypes kt){
		this.c=c;
		this.kt=kt;

	}
	@Override
	public double doOperation(String str) {
		boolean rulesFlag=false;
		double res=0;
		String resp=null;

		String[] aft=str.split(" ");
		resp=(kt.getValuesMap(aft[0]));
		for(int i=1;i<aft.length-1;i++) {
			if(kt.getValuesMap(aft[i])!=null) {
				resp=resp+" "+(kt.getValuesMap(aft[i]));
			}else if(kt.getElementMap(aft[i])!= 0.0) {
				if(res==0.0) {
					res=1.0;
				}
				res=res*kt.getElementMap(aft[i]);
			}




			else {
				System.out.println(errorString);
				break;

			}


		}
/*Apply Rules */
		RulesApplier ra=new RulesApplier();
		rulesFlag= ra.apply(resp);
		if(rulesFlag==false) {
			if(res!=0) {
				res=res*c.doOperation(resp+"");
			}
			else {
				res=c.doOperation(resp+"");
			}}
		else {
			System.out.println(str);
			res=0;
		}
		return res;


	}

}
