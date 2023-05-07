package hw3_;

public class Supervisor extends Doctor 
{
	protected Employee [] teamArr = new Employee[10];
	protected int numOfTeamMembers;
	public Supervisor(String name, int seniority, int hourlyRate,String residency) 
	{
		super(name, seniority, hourlyRate, residency);
		
		
	}
	
	public int getNumOfTeamMembers()
	{
		return numOfTeamMembers;
	}
	
	public void setNumOfTeamMembers(int numOfTeamMembers)
	{
		this.numOfTeamMembers=numOfTeamMembers;
	}
	
	public double monthlyPayment(int hours)
	{
		//check again
		return ((1+teamArr.length*0.02)*hours*hourlyRate)*2;
	}
	
	public void addEmp(Employee employee)
	{
		teamArr[numOfTeamMembers]=employee;
		numOfTeamMembers++;
	}

}
