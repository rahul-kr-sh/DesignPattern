package com.sapient.pack1;

import java.util.Observable;
import java.util.Observer;

public class Customer implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof Order){
			Order order=(Order)o;
			System.out.println("Customer notifies  "+order.getStatus());
		}
		
	}

}
