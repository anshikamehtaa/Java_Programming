package Assignment_01;
public class Q7 {

	public static void main(String[] args) {
		
		Employee_ s1 = new Employee_();
		Employee_ s2= new Employee_();
		Employee_ s3 = new Employee_();
		s1.display();
		s2.display();
		s3.display();
		s1.display();
		System.out.println("Total number of object created : "+Employee_.obj_count);
		System.out.println("total number of menber fun call : "+ Employee_.mem_fun_count);
	}
 
}
 class Employee_
{
	static int mem_fun_count ;
	static int obj_count ;
	Employee_()
	{
		obj_count++;
	}
	 void display ()
	{
		 mem_fun_count++;
		System.out.println("function is called " + mem_fun_count + " times");
	}
}