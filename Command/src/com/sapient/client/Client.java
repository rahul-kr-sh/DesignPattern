package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.EmployeeService;
import com.sapient.vo.Employee;

public class Client {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the eid");
		int eid=scan.nextInt();
		System.out.println("Enter the ename");
		String ename=scan.next();
		System.out.println("Enter the salary");
		double salary=scan.nextDouble();
		
		Employee employee=new Employee();
		employee.setEid(eid);
		employee.setEname(ename);
		employee.setSal(salary);
		
		EmployeeService employeeService=new EmployeeService();
		boolean res=employeeService.addToFile(employee);
		System.out.println("Result: "+ res);
		scan.close();
		

	}

}
