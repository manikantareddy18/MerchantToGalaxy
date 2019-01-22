package com.thought.converter;
/*THis is to evaluate the merchant related all the queries for his transactions*/
public class MerchantQueries implements Questions{
	Converter c;
	public void getValues(String str,KeyTypes kt) {

		double value;
		if(str.contains(HOW_MANY_CREDITS)||str.contains(HOW_MUCH_IS)) {
			c=new ConvertRomanValuesToNum();
			//Here we will apply Rules as well
			c=new ConvertToRomanValues(c, kt);
			c=new RomanStringParser(c);
			value=c.doOperation(str);
			if(str.contains(HOW_MANY_CREDITS)) {
				System.out.println(str.substring( str.indexOf(IS)+3,str.length()-1)+IS+(int)value+CREDITS);
			}
			else {
				System.out.println(str.substring( str.indexOf(IS)+3,str.length()-1)+IS+(int)value);
			}
		}
		else if(str.contains(IS) && str.contains(CREDITS) ) {
			c=new ConvertRomanValuesToNum();
			c=new ConvertToRomanValues(c, kt);
			c=new CalculateElementValue(c, kt);
			value=c.doOperation(str);
		}
		else if(str.contains(IS)) {
			c=new AddValues( kt);
			value=c.doOperation(str);
		}else {
			System.out.println(errorString);
		}
	}
}
