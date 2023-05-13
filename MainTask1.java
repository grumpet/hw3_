//Nimrod Katzenell 206776734
//Gonen Matis 318651411
package hw3_;

public class MainTask1 
{
	public static int clean(Room room)
	{
		int time=0;
		

		if(room.getClass() == MeetingRoom.class)
		{
			if(((MeetingRoom) room).getIsProject())
			{
				time+=10;
			}
		}
		else if(room.getClass() == ClassRoom.class)
		{
			time+=((ClassRoom) room).getNumOfRows()*3;
		}
		time+=room.numOfSeats*2;
		
		return time;
	}

	public static void main(String[] args) 
	{
		
		
		Room room1=new Room(4 , 50);
		Room room2=new Room(3 , 50);
		MeetingRoom meetingRoom1=new MeetingRoom(10 , 100 , true );
		ClassRoom classRoom1 = new ClassRoom(24 , 250 ,4);
		room1.print();
		System.out.println("Cleaning time "+clean(room1)+" minutes \n");
		room2.print();
		System.out.println("Cleaning time " +clean(room2)+" minutes \n");
		meetingRoom1.print();
		System.out.println("Cleaning time " + clean(meetingRoom1)+" minutes \n");
		classRoom1.print();
		System.out.println("Cleaning time " + clean(classRoom1)+" minutes \n");
		
	
	
	
	
	
	}

}
