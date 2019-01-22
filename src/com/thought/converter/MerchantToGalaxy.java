package com.thought.converter;

import java.util.Scanner;


/*Program evaluation starts from here*/
public class MerchantToGalaxy {
	Roman r=new Roman();
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str= s.nextLine();
		KeyTypes kt=new KeyTypes();
		MerchantQueries m=new MerchantQueries();
		while(str!=null&&!str.equals("")){
			m.getValues(str,kt);
			str= s.nextLine();
		}

	}

}
