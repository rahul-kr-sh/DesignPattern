package com.sapient.vo;

public class CustomerSummary {
	
	public void getCustomerSummary(Customer cust){
		System.out.println(cust.display());
		System.out.println(cust.getAddress().getHouseNo()+ ",");
	}
}
