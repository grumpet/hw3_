package hw3_;

import java.util.ArrayList;
import java.util.Scanner;
public class Staff
{
    Scanner scanner = new Scanner(System.in);
    protected ArrayList<Employee> staffList;
	public Staff(ArrayList<Employee> staffList) 
	{
		this.staffList=staffList;
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
			System.out.print("Employee: "+staffList.get(i).getName()+" please enter amount of hours: ");
			total+=staffList.get(i).monthlyPayment(scanner.nextInt());
		}
		System.out.println("total payment: "+total);
		return total;
	}
	

}
