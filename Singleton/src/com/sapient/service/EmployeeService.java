package com.sapient.service;

import java.util.HashMap;
import java.util.Map;

public class EmployeeService implements IEmployeeSer{
	
	private static Map<Integer,String> emap;
	private  static final EmployeeService ser;
	
	static{
		ser=new EmployeeService();
		emap=new HashMap<>();
		emap.put(1001, "prem");
		emap.put(1002, "vivek");
		emap.put(1003, "yadav");
	}
	private EmployeeService(){
		
	}
	/*
	 * we made getInstance() synchronized so that it can be used by only one client.
	 */
	public synchronized static IEmployeeSer getInstance(){
		/*if(ser==null){
			System.out.println("new instance");
			
		}
		else{
			System.out.println("old Instance");
		}*/
		return ser;
	}
	
	
	
	
	public String display(int eid) throws Exception{
		if(!emap.containsKey(eid))
			throw new Exception("ID not found");
		return emap.get(eid);
	}
}
