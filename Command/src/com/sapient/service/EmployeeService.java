package com.sapient.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

import com.sapient.vo.Employee;

public class EmployeeService {

	
	/*
	 * Command pattern
	 */
	public boolean addToFile(Employee employee){
		boolean res=false;
		double netSal=0;
		double pf=0;
		
		/*
		 * it will overwrite the previous data in file
		 */
//		try(PrintWriter pr=new PrintWriter("sap.txt")) { 
		
		
//		try(BufferedWriter br=new BufferedWriter(new FileWriter("sap.txt",true))) {
		try(PrintWriter pr=new PrintWriter(new FileWriter("sap.txt",true))) {
			pf=employee.getSal()* .12;
			netSal=employee.getSal()-pf;
			pr.write(employee.getEid()+ "," + employee.getEname()+ ","+ employee.getSal());
			res=true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return res;
	}
}
