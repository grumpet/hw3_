package hw3_;

public class Room 
{
	 private int numOfSeats;
	    private int basePrice;

	    public Room(int numOfSeats, int basePrice) {
	        this.numOfSeats = numOfSeats;
	        this.basePrice = basePrice;
	    }

	    public int getNumSeats() {
	        return numOfSeats;
	    }

	    public int getBasePrice() {
	        return basePrice;
	    }

	    public void setNumOfSeats(int numOfSeats) 
	    {
	    	if(numOfSeats>=0)
	    	{
	    		this.numOfSeats = numOfSeats;
	    	}
	        
	    }

	    public void setBasePrice(int basePrice) {
	        this.basePrice = basePrice;
	    }

	    public void print() {
	        System.out.println("number of seats = " + numOfSeats);
	        System.out.println("price = " + basePrice);
	    }

}
