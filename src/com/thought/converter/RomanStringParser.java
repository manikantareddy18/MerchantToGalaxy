package com.thought.converter;



public class RomanStringParser implements Converter {

	Converter c;
	RomanStringParser(Converter c){
		this.c=c;
	}
	@Override
	public double doOperation(String str) {
		
		String substr = IS ;
		String after = str.substring( str.indexOf(substr)+3,str.length());	
		int res=(int) c.doOperation(after);
		//	System.out.println(str.substring( str.indexOf(IS)+3,str.length()-1)+IS+res+CREDITS);
			return res;
		}
	
	
	



}
