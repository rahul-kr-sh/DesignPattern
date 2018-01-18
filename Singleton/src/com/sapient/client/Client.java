package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.EmployeeService;
import com.sapient.service.IEmployeeSer;

public class Client {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		IEmployeeSer ser=null;
		String opt=null;
		int eid=0;
		do{
			ser=EmployeeService.getInstance();
			System.out.println("Enter id");
			eid=scan.nextInt();
			try {
				System.out.println(ser.display(eid));
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Press y to conyinue");
			opt=scan.next();
			
		}while(opt.equalsIgnoreCase("y"));
		System.out.println("buy buy ...");
		scan.close();
	}

}
