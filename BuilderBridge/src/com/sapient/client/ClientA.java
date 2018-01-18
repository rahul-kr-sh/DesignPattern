package com.sapient.client;

import java.util.Scanner;

import com.sapient.computers.CompBuilder;
import com.sapient.computers.Computer;

public class ClientA {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the computer type");
		String ctype=scan.next();
		System.out.println("Enter the processor");
		String ptype=scan.next();
		try {
			Computer comp=CompBuilder.getComputer(ctype, ptype);
			comp.start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}

	}

}
