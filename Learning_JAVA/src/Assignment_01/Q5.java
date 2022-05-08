package Assignment_01;
import java.util.Scanner;
public class Q5 {
        public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float s_A  = 0 , s_B = 0 , s_C =0  , s_D = 0;
		Employeee Emp[] = new Employeee[8];
		for(int i = 0 ; i<8 ; i++)
		{
		System.out.println("Enter detail of Employee "+(i+1));
		 Emp[i] = new Employeee(sc.next(), sc.nextInt() ,sc.next() ,sc.nextFloat());
		 if(Emp[i].department.equals("A"))
		 {
			 s_A  += (Emp[i].salary > 30000) ? 25000 : Emp[i].salary;
		 }
		 else if(Emp[i].department.equals("B"))
		 {
			 s_B  += (Emp[i].salary > 30000) ? 25000 : Emp[i].salary;
		 }
		 else if(Emp[i].department.equals("C"))
		 {
			 s_C  += (Emp[i].salary > 30000) ? 25000 : Emp[i].salary;
		 }
		 else if(Emp[i].department.equals("D"))
		 {
			 s_D  += (Emp[i].salary > 30000) ? 25000 : Emp[i].salary;
		 }
	}
         System.out.println("Total Salary In Department A : "  + s_A);
		 System.out.println("Total Salary In Department B : "  + s_B);
		 System.out.println("Total Salary In Department C : "  + s_C);
		 System.out.println("Total Salary In Department D : "  + s_D);
	}
}
class Employeee
{
	String  name ;
	int age ;
	String department ;
	float salary;
	Employeee (String n , int a , String d , float s)
	{
		name = n;
		age = a;
		department = d;
		salary = s;
	}
}