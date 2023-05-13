//Nimrod Katzenell 206776734
//Gonen Matis 318651411
package hw3_;

public class Employee 
{
	protected  String name;
	protected  int seniority;
	protected  int hourlyRate;
	
	public Employee(String name,int seniority,int hourlyRate)
	{
		this.name=name;
		this.seniority=seniority;
		this.hourlyRate=hourlyRate;
	}
	
	public String getName()
	{
		return name;
	}
	public int getSeniority()
	{
		return seniority;
	}
	public int getHourlyRate()
	{
		return hourlyRate;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSeniority(int seniority)
	{
		if(seniority<0)
		{
			this.seniority=0;
		}
		else
		{
			this.seniority=seniority;
		}
	}
	
	public void setHourlyRate(int hourlyRate)
	{
		if(hourlyRate<0)
		{
			this.hourlyRate=100;
		}
		else
		{
			this.hourlyRate=hourlyRate;
		}
	}
	
	public double monthlyPayment(int hours)
	{
		double temp=1;
		if(seniority>=10)
		{
			temp=1.1;
		}
		else if(seniority>=20)
		{
			temp=1.2;
		}
		
		return hourlyRate*hours*temp;
		
	}
	

}
