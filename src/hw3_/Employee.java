package hw3_;

public class Employee 
{
	private String name;
	private int seniority;
	private int hourlyRate;
	
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
	

}
