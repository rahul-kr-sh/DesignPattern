package com.sapient.pack1;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Order order=new Order();
		Customer customer=new Customer();
		
		order.addObserver(customer);
		String str=null;
		do{
			System.out.println("Admin change the status");
			str=scan.next();
			order.setStatus(str);
		}while(!str.equals("delivered"));
		scan.close();
	}

}
