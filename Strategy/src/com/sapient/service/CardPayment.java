package com.sapient.service;

public class CardPayment implements PaymentStrategy {

	
	private static CardPayment cardPayment=new CardPayment();
	private  CardPayment() {
		
	}
	
	/*
	 * making singleton code
	 */
	public static PaymentStrategy getCard(){
		return cardPayment;
	}
	
	@Override
	public void doPayment() {
		System.out.println("Card Payment is processed");
	}

}
