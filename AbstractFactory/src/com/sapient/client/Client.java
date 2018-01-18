package com.sapient.client;

import java.util.Collection;
import java.util.Scanner;

import com.sapient.service.CollectionFactory;

public class Client {

	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the type of collection");
		String type=scan.next();
		Collection<String> coll=new CollectionFactory().getCollection(type);
		coll.add("ram");
		coll.add("sam");
		coll.add("tom");
		coll.add("peter");
		coll.add("ramu");
		coll.add("shyamu");
		System.out.println(coll.getClass().getSimpleName() + " " + coll);
		scan.close();
	}

}
