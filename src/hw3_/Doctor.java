package hw3_;

public class Doctor extends Employee 
{
	private String residency;
	public Doctor(String name, int seniority, int hourlyRate , String residency) 
	{
		super(name, seniority, hourlyRate);
		this.residency=residency;
	}
	
	public String getResidency()
	{
		return residency;
	}
	
	public void setResidency(String residency) 
	{
		this.residency=residency;
	}
	public double monthlyPayment(int hours)
	{
		return hourlyRate*hours*2;
	}

}
