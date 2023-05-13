//Nimrod Katzenell 206776734
//Gonen Matis 318651411

package hw3_;
import java.util.ArrayList;
import java.util.Scanner;
public class MainTask2 
{

	public static void main(String[] args) 
	{
	    Scanner scanner = new Scanner(System.in);
		Employee employee1 = new Employee("Yosi employee",3,100);
		Nurse nurse1 = new Nurse("Rohama the nurse", 10, 150,"basic");
		Nurse nurse2 = new Nurse("Rael the nurse",8,120,"advanced");
		System.out.print("please enter doctors residency:");
		Doctor doctor1 = new Doctor("Udi the doctor",6,150,scanner.next());
		System.out.print("please enter doctors residency:");
		Doctor doctor2 = new Doctor("Nir the doctor",0,100,scanner.next());
		System.out.print("please enter supervisor residency:");
		Supervisor supervisor= new Supervisor("Ben the supervisor",6,150,scanner.next(),0);
		supervisor.addEmp(nurse1);
		supervisor.addEmp(nurse2);
		supervisor.addEmp(doctor1);
		ArrayList<Employee> staffList=new ArrayList<Employee>();
		Staff staff= new Staff(staffList);
		staff.buildStaff(employee1);
		staff.buildStaff(nurse1);
		staff.buildStaff(nurse2);
		staff.buildStaff(doctor1);
		staff.buildStaff(doctor2);
		staff.buildStaff(supervisor);
		staff.calcSalary();
		scanner.close();



	}

}
