package com.thought.converter;

public class AddValues implements Converter {
	Roman r=new Roman();
	KeyTypes kt;
	AddValues(KeyTypes kt){
		this.kt=kt;
	}
	@Override
	public double doOperation(String str) {

		String substr = IS;
		String before = str.substring(0, str.indexOf(substr));
		String after = str.substring( str.indexOf(substr)+2,str.length()).trim();
		kt.setValuesMap(before.trim(), after);
		return 0.0;


	
	}

}
