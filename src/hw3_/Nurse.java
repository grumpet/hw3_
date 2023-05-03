package hw3_;

public class Nurse extends Employee 
{
	private String type;
	public Nurse(String name, int seniority, int hourlyRate) 
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

	
	

}
