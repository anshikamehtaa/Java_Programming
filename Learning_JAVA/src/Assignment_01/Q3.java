package Assignment_01;
public class Q3 {
    public static void main(String[] args) {
		System.out.println("Anshika Mehta");
		testClass t = new testClass();
		t.display(8);
		t.display(2);}}
interface in1
{
	void display(int p ) ;
}
class testClass implements in1
{
	public void display(int p )
	{   int c = 0 ;
		for(int i = p/2 ; i>1 ; i--)
		{
			if(p%i == 0)
			{
				c++;
				break;
			}}
		if(c == 0 && p >1 )
			System.out.println(p+ "is  prime");
		else
			System.out.println(p + "is not prime");	
	}
}
