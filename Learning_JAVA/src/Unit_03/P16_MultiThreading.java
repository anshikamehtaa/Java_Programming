package Unit_03;

import java.util.Scanner;

//PREREQUISITES
//Multithreading is required so that cases of dead end can be executed so that the cpu does not stop working oif it encounters any dead end code
//Those codes(which are not required to execute sequentially) which are independent can be written inside thread and executed through multithreading
//process is managed by OS and working is managed by the backend executing part of the language being used 
//Multiprocessing
//
/* 1-Sequential Multiprocessing
 *Only one processing is executed at a time and it waits until previous one is completed
 *
 * 2-Parallel Multiprocessing
 * Best processing but it's not compatible for normal devices
 * 3-Concurrent Multiprocessing 
 * Works according to OS by scheduling tasks/User can only start the process
 *
 */
//Multitasking
/*1-Sequential Multitasking
 * A process is further divided into parts and is sequentially executed
 * 2-Parallel Multitasking
 * A process is further divided into parts and is parallely executed
 * 3-Concurrent Multitasking/Switching based
 * 
 * Individual tasks are done by giving them some amount of resources and they are not related and execute individually
 * 
*/

public class P16_MultiThreading {

	public static void main(String[] args) {
//		MultiThreadingInJava obj=new MultiThreadingInJava();
//		obj.threadConcept();
//		obj.threadSynchronization();
//		obj.interThreadCommunication();
//		obj.producerConsumerProblem();
//		obj.wait_And_Notify();
//		c1 obj1=new c1();
//		c2 obj2=new c2();
//		obj1.show1();
//		obj2.show2();
		
		Thread t1=new Thread(new T1(),"T1");
		Thread t2=new Thread(new T2(),"T2");
		Thread t3=new Thread(new T3(),"T3");
		t1.start();
		t2.start();
		t3.start();

	}

}
class c1
{
void show1()
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println(a);
}
}

class c2
{
void show2()
{
for(int i=0;i<10;i++)
{
	System.out.println("Hey-2");	
}
}
}
class MultiThreadingInJava
{
	void threadConcept()
	{
		
	}
	void threadSynchronization()
	{
		
	}
	void interThreadCommunication()
	{
		
	}
	void producerConsumerProblem()
	{
		
	}
	void wait_And_Notify()
	{
		
	}
}


class T1 extends Thread
{
public void run()
{
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     System.out.println(a);
}
}

class T2 extends Thread
{
public void run()
{
for(int i=0;i<10;i++)
{
	System.out.println("Hey-2");	
}
}
}

class T3 extends Thread
{
public void run()
{
for(int i=0;i<10;i++)
{
	System.out.println("Hey-3");	
}
}
}