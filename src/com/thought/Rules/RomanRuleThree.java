package com.thought.Rules;

import com.thought.converter.Roman;

public class RomanRuleThree  implements Rules{
Roman r=new Roman();
	@Override
	public boolean applyRule(String value) {
		// TODO Auto-generated method stub
		boolean res=ConsecutiveSmalls(value);
		return res;
	}
	




//Roman to Decimal with Rule3
public boolean ConsecutiveSmalls(String before) {
boolean response=false;
int result=0;
String[] str=before.split(" ");
for(int i=0;i<str.length;i++) {
	int s1=r.value((str[i].charAt(0)));
	if(i+1<str.length) {
		int s2=r.value(str[i+1].charAt(0));
		if(i+2<str.length) {
			int s3=	r.value(str[i+2].charAt(0));
		if(s1<s3) {
			response=true;
			break;
		}
		}
		if(s1>=s2) {
			result=s1+s2;
			i=i+1;
		}
		else {
			result=result+s2-s1;
			i=i+1;
		}
	}
		
	}
	return response;
}


}
