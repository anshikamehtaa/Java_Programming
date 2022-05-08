package Assignment_01;
public class Q9 {
       public static void main(String[] args) {
		
		A a = new A(); 
		B b = new B();  
        C c = new C();  
        a.fun1();
        a.fun2();
        a.fun3();
        b.fun3();
        c.fun3();  
	}
}
class A 
{
	void fun1()
	{
		System.out.println("This is default fun1");
	}
	public void fun2()
	{
		System.out.println("This is public Fun2");
	}
	protected void fun3()
	{
	 System.out.println("this is protected fun3");
	}
	private void fun4()
	{
		System.out.println("This is private fun4");
	}
}
class B extends A 
{
}
class C extends B
{
}
class D
{
	void display()
	{
		A a = new A();
		a.fun2(); 
	}
}
