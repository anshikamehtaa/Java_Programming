package Assignment_01;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {

		student s[] = new student[6];
	
        float avg_per = 0;
		for( int i =0 ;i< 6 ; i++)
		{
			s[i] = new student ();
			avg_per += s[i].percentage;
		}
		avg_per = avg_per /6;
		 
System.out.println("Average Percentage of the Student : "+ avg_per);
	}
}
class student
{
	String name ;
	int age ;
	char section ;
	float  percentage;
	
	student()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name : ");
		name = sc.nextLine();
		System.out.print("Enter age : ");
		age = sc.nextInt();
		System.out.print("Enter Section : ");
	    section = sc.next().charAt(0);
		System.out.print("Enter Percentage : ");
		percentage = sc.nextFloat();
		
	}
	void printdata()
	{
		System.out.println(name + age);
	}
}