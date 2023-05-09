package hw3_;

public class Nurse extends Employee 
{
	protected String type;
	public Nurse(String name, int seniority, int hourlyRate , String type) 
	{
		super(name, seniority, hourlyRate);
		this.type=type;
	}
	
	public String getType()
	{
		return type;
	}
	
	public void setType(String type)
	{
		this.type=type;
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
		if(type=="advanced")
		{
			return temp*1.2*hourlyRate*hours+150;
		}
		else
		{
			return temp*1.2*hourlyRate*hours;
		}
		
	}

	
	

}
