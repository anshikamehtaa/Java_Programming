package Unit_03;

import java.util.Scanner;

public class P14_ExceptionHandling {

	public static void main(String[] args) {
		ABCD obj=new ABCD();
		//obj.basicException();
		//obj.handleException();
		//obj.multiplecatch();
		//obj.InputMismatchException();
		//obj.stackOverFlowError(int i);
		//obj.indexOutofBoundExceptionPart1();
		//obj.indexOutofBoundExceptionPart2();
		//obj.nullPointerException();
		//obj.useofThrow(8);
		//obj.useofThrows_and_Finally();
		//obj.checkedAnduncheckedException();
	}
//enforces try-catch in checked exception
}
class ABCD
{
void basicException() //unchecked or compile exception(compiler can't figure out this exception at compiler time)
{
	//compiler can't catch this exception at compile time
	int b=0;
	int a=100/b;
	System.out.println(a);
}
void handleException()
{
	//even if exception occurs it will not terminate rest of the program
	
	try
	{
		//sensitive code that can terminate the program
		int b=0;
		int a=100/b;
		System.out.println(a);	
	}
	catch(ArithmeticException e)
	{
		System.out.println(e.getMessage());
	}
	System.out.println("Done!");
}
void multiplecatch()
{
	try
	{
		//sensitive code that can terminate the program
		int b=0;
		int a=100/b;
		System.out.println(a);	
	}
	//in multiple catch block we have to create catch for child class first because if we have refrence of super class(Exception) then the catch will never move to specific catch
	
	catch(ArithmeticException e)
	{
		System.out.println(e.getMessage()+"Hello:");
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
void InputMismatchException()
{
	try {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int number=sc.nextInt();
	System.out.println("You have entered: "+number);
	sc.close();
	}
	catch(InputMismatchException e)
	{
		System.out.println("Input Mismatch Issue!");
	}
	System.out.println("Done!");
}
void stackOverFlowError(int i)
{
	//It will create an error which can't be handled
	//No matter how many try/catch we create this will not be caught because error can't be handled
	//Here memory gets full because of infinite loop
	try {
		while(i>0)
		{
			i++;
			stackOverFlowError(i);
		}
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
void indexOutofBoundExceptionPart1()   //Here the exception is not handled
{
	int[] myNumbers= {1,2,3};
	System.out.println(myNumbers[10]);
	
}
void indexOutofBoundExceptionPart2()  //Exception is handled
{
	try {
		int[] myNumbers= {1,2,3};
		System.out.println(myNumbers[10]);
		
	}
	catch(Exception e)
	{
		System.out.println("Something went wrong!");
	}
	
}
void nullPointerException()
{
	try
	{
		String s=null;
		System.out.println(s.length());
	}
	catch(NullPointerException e)
	{
		System.out.println(e.getMessage());
	}
}
void useofThrow(int age) throws Exception //used to handle the lazy exceptions which are not handled within the same place
{   //to tell the program to create throw and catch for handling exception
	//if we have multi-chain calling then instead of writing codes for every exception we can use throw to handle all exceptions together.
	//checked or compile time exception(compiler tells the programmer to handle the exceptions that will come)
	if(age<18)
	{
		throw new Exception(); //throw is used with new to throw a manual exception(created by programmer)
	}
	else
	{
		System.out.println("You are allowed to enter");
	}
}
void useofThrows_and_Finally()
{
	try
	{
		useofThrow(17);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	finally //used for the ease of exception handling
	{
		System.out.println("This will be executed");
	}
}
void checkedAnduncheckedException()
{
	//Unchecked Expression
	int b=0;
	int a=100/b;
	System.out.println(a);
	//Checked Exception
    try {
    	useofThrow(17);
    }catch(Exception e)
    {
    	e.printStackTrace();
    }

}

}
 