//Nimrod Katzenell 206776734
//Gonen Matis 318651411
package hw3_;

public class Supervisor extends Doctor 
{
	private Employee [] teamArr;
	private int numOfTeamMembers;
	public Supervisor(String name, int seniority, int hourlyRate,String residency,int numOfTeamMembers) 
	{
		super(name, seniority, hourlyRate, residency);
		setNumOfTeamMembers(numOfTeamMembers);
		this.teamArr=new Employee[10];
		
		
	}
	
	public int getNumOfTeamMembers()
	{
		return numOfTeamMembers;
	}
	
	public void setNumOfTeamMembers(int numOfTeamMembers)
	{
		if(numOfTeamMembers>=0 && numOfTeamMembers < 11)
			
		{
			this.numOfTeamMembers=numOfTeamMembers;
		}
			
	}
	@Override
	public double monthlyPayment(int hours)
	{
		double bonos=0;
		double sum=0;
		sum=((super.monthlyPayment(hours)));
		bonos=((sum/100*2))*numOfTeamMembers;
		return bonos+sum;
	}
	
	public boolean addEmp(Employee employee)
	{
		if(numOfTeamMembers<10)
		{
			teamArr[numOfTeamMembers]=employee;
			numOfTeamMembers++;
			return true;
		}
		else
		{
			System.out.println("No avalibale space");
			return false;
		}
		
	}

}
