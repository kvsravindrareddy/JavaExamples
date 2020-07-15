package com.trendingtech;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeEx emp1 = new EmployeeEx("E123","Veera","10000");
		EmployeeEx emp2 = new EmployeeEx("E123","Veera","10000");
		
		if(emp1==emp2)
		{
			System.out.println("emp references are equal");
		} else
		{
			System.out.println("emp references are not equal");
		}
		
		if(emp1.equals(emp2))
		{
			System.out.println("Emp object is equal");
		}
		else
		{
			System.out.println("Emp object is not equal");
		}
	}
}