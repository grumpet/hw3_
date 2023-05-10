package hw3_;

public class MeetingRoom extends Room 
{
	 private boolean isProject;

	    public MeetingRoom(int numOfSeats, int basePrice, boolean isProject) {
	        super(numOfSeats, basePrice);
	        this.isProject = isProject;
	    }

	    public boolean getIsProject() {
	        return isProject;
	    }

	    public void setIsProject(boolean isProject) {
	        this.isProject = isProject;
	    }

	    @Override
	    public void print() {
	        System.out.print("meeting room:\n");
	        super.print();
	        System.out.print("is project = " + isProject+"\n");
	       

	    }

}
