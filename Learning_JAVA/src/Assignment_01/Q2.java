package Assignment_01;

	public class Q2 {

		public static void main(String[] args) {
		
			Sample s1 = new Sample();
			Sample s2= new Sample();
			Sample s3 = new Sample();
			s1.fun();
			s2.fun();
			s3.fun();
			System.out.println("total number of call : "+ Sample.b);
		}
	 
	}
    class Sample
	{
		static int b ;
		 void fun ()
		{
			b++;
			System.out.println("function is called " + b + " times");
		}
	}

