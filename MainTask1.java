package hw3_;

public class MainTask1 
{
	public static int clean(Room room)
	{
		int time=0;
		

		if(room instanceof MeetingRoom)
		{
			if(((MeetingRoom) room).getIsProject())
			{
				time+=10;
			}
		}
		else if(room instanceof ClassRoom)
		{
			time+=((ClassRoom) room).getNumOfRows()*3;
		}
		time+=room.numOfSeats*2;
		
		return time;
	}

	public static void main(String[] args) 
	{
		
		
		MeetingRoom meetingroom1=new MeetingRoom(4 , 50 , false );
		MeetingRoom meetingroom2=new MeetingRoom(3 , 50 , false );
		MeetingRoom meetingroom3=new MeetingRoom(10 , 100 , true );
		ClassRoom classroom1 = new ClassRoom(24 , 250 ,4);
		meetingroom1.print();
		System.out.println("cleaning time "+clean(meetingroom1)+" minutes \n");
		meetingroom2.print();
		System.out.println("cleaning time " +clean(meetingroom2)+" minutes \n");
		meetingroom3.print();
		System.out.println("cleaning time " + clean(meetingroom3)+" minutes \n");
		classroom1.print();
		System.out.println("cleaning time " + clean(classroom1)+" minutes \n");
		
	
	
	
	
	
	}

}
