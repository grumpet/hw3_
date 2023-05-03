package hw3_;

public class ClassRoom extends Room 
{
	private int numOfRows;
	public ClassRoom(int numOfSeats, int basePrice , int numOfRows)
	{
		super(numOfSeats, basePrice);
		this.numOfRows=numOfRows;
	}
	 public int getNumOfRows()
	 {
		 return numOfRows;
	 }
	 
	 public void setNumOfRows(int numOfRows)
	 {
		 if(numOfRows<=0)
		 {
			 this.numOfRows=1;
		 }
		 else
		 {
			 this.numOfRows=numOfRows;
		 }
		 
	 }
	    @Override
	    public void print()
	    {
	    	  System.out.print("class room:\n");
		      super.print();
		      System.out.print("num rows: "+numOfRows +"\n");
	    }
	 
}
