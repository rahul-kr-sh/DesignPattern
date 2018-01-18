package com.sapient.service;

import java.util.HashMap;
import java.util.Map;

public class PaymentFactory {

	private static Map<String,PaymentStrategy> pMap;
	
	static{
		pMap=new HashMap<>();
		pMap.put("card", CardPayment.getCard());
		pMap.put("neft", NeftPayment.getNEFT());
	}
	public static PaymentStrategy getInstance(String strategy) throws Exception{
		PaymentStrategy obj=null;
		if(!pMap.containsKey(strategy))
			throw new Exception("Invalid mode");
		obj=pMap.get(strategy);
		return obj;
	}
}
