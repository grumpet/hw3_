package hw3_;

public class Supervisor extends Employee 
{
	private Employee [] teamArr = new Employee[10];
	private int numOfTeamMembers;
	public Supervisor(String name, int seniority, int hourlyRate, Employee [] teamArr,int numOfTeamMembers) 
	{
		super(name, seniority, hourlyRate);
		this.numOfTeamMembers=numOfTeamMembers;
		this.teamArr=teamArr;
	}
	
	//get and set team arr no se 
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
