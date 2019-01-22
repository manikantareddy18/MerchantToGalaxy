package com.thought.converter;


/*To calculate the Element values and put it in elements Map*/
public class CalculateElementValue implements Converter{
Converter c;
KeyTypes kt;

CalculateElementValue(Converter c,KeyTypes kt){
	this.c=c;
	this.kt=kt;
}
	@Override
	public double doOperation(String str) {

		// TODO Auto-generated method stub
		String substr = IS;
		String before = str.substring(0, str.indexOf(substr));
		double res=c.doOperation(before);
		String[] bef=before.split(" ");
	

		String intValue = str.replaceAll("[^0-9]", "");
		double elementValue=Double.parseDouble(intValue)/res;
		kt.setElementMap(bef[bef.length-1], elementValue);
		return elementValue;
	}

}
