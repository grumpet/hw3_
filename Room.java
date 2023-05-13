//Nimrod Katzenell 206776734
//Gonen Matis 318651411
package hw3_;

public class Room 
{
	protected  int numOfSeats;
	protected  int basePrice;

	    public Room(int numOfSeats, int basePrice) {
	    	setNumOfSeats(numOfSeats);
	    	setBasePrice(basePrice);
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
	    	if(basePrice<0)
	    	{
	    		this.basePrice=0;
	    	}
	    	else
	    	{
	    		this.basePrice = basePrice;
	    	}
	        
	    }

	    public void print() {
	        System.out.println("number of seats = " + numOfSeats);
	        System.out.println("price = " + basePrice);
	    }

}
