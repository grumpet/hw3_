package hw3_;

import java.util.ArrayList;
import java.util.Scanner;
public class Staff extends Employee
{
    Scanner scanner = new Scanner(System.in);
	private ArrayList<Employee> staffList;
	public Staff(String name, int seniority, int hourlyRate, ArrayList<Employee> staffList) 
	{
		super(name, seniority, hourlyRate);
		staffList=new ArrayList<Employee>();
	}
	public void buildStaff(Employee employee)
	{
		staffList.add(employee);
	}
	
	public double calcSalary()
	{
		double total=0;
		for(int i=0;i<staffList.size();i++)
		{
			System.out.print("Employee number "+i+" please enter amount of hours: ");
			total+=staffList.get(i).monthlyPayment(scanner.nextInt());
		}
		return total;
	}
	

}
