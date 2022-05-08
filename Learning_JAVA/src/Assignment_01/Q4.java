package Assignment_01;
public class Q4 {
    public static void main(String[] args) {
       ClassThree s = new ClassThree();
	}
}
class ClassOne 
{
   ClassOne(int a )  // parameterized constructor 
   {
	   System.out.println("This is classOne parametrised Constructor ");
   }
}
class ClassTwo  extends ClassOne
{
	ClassTwo()   // default constructor
	{  
		super(6);
		System.out.println("This is clasTwo Constructor ");
	}
}
class ClassThree extends ClassTwo
{
   ClassThree()     // default constructor 
   {
	   System.out.println("This is classThree Constructor ");
   }
   ClassThree(int x)    // Parameterized constructor 
   {
	   System.out.println("This is classThree Parameterised Constructor ");
   }
}