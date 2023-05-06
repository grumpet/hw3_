package hw3_;

public class Nurse extends Employee 
{
	private String type;
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
		if(type=="advanced")
		{
			return 1.2*(hourlyRate*hours)+150;
		}
		else
		{
			return 1.2*hourlyRate*hours;
		}
		
	}

	
	

}
