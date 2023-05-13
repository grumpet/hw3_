//Nimrod Katzenell 206776734
//Gonen Matis 318651411
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
	@Override
	public double monthlyPayment(int hours)
	{
		double temp=1;
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
