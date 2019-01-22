package com.thought.converter;
public class Roman {
	
	public int value(char r) {
		int res=0;
		if(r=='I') {
			res= 1;
		}
		if(r=='V') {
			res= 5;
		}
		if(r=='X') {
			res= 10;
		}
		if(r=='L') {
			res= 50;
		}
		if(r=='C') {
			res= 100;
		}
		if(r=='D') {
			res= 500;
		}
		if(r=='M') {
			res= 1000;
		}
		
		return res;
	}
	

}
