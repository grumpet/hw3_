//Nimrod Katzenell 206776734
//Gonen Matis 318651411
package hw3_;

public class ClassRoom extends Room 
{
	private int numOfRows;
	public ClassRoom(int numOfSeats, int basePrice , int numOfRows)
	{
		super(numOfSeats, basePrice);
		setNumOfRows(numOfRows);
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
	    	  System.out.print("Class room:\n");
		      super.print();
		      System.out.print("num rows: "+numOfRows +"\n");
	    }
	 
}
