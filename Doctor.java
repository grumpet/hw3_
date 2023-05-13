//Nimrod Katzenell 206776734
//Gonen Matis 318651411
package hw3_;

public class Doctor extends Employee 
{
	protected String residency;
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
	@Override
	public double monthlyPayment(int hours)
	{
		return hourlyRate*hours*2;
	}

}
