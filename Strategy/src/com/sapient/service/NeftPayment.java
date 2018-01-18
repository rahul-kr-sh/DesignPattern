package com.sapient.service;

public class NeftPayment implements PaymentStrategy {

	
	
	private static NeftPayment neftPayment=new NeftPayment();
	private  NeftPayment() {
		
	}
	
	/*
	 * making singleton code
	 */
	public static PaymentStrategy getNEFT(){
		return neftPayment;
	}
	
	@Override
	public void doPayment() {
		System.out.println("NEFT Payment is processed");

	}

}
