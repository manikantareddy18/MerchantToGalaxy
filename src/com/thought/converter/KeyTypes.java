package com.thought.converter;

import java.util.HashMap;
import java.util.Map;

public class KeyTypes {
	private Map<String,String> valuesMap=new HashMap<String, String>();
	private Map<String,Double> elementMap=new HashMap<String, Double>();
	public String getValuesMap(String key) {
		return   valuesMap.get(key);
	}
	public void setValuesMap(String key,String value) {
		this.valuesMap.put(key, value);
	}
	public Double getElementMap(String key) {
		return (Double) elementMap.get(key);
	}
	public void setElementMap(String key,Double value) {
		this.elementMap.put(key, value);
	}

	
}
