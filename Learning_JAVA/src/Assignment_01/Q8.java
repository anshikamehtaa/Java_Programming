package Assignment_01;
import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array ");
	int n = sc.nextInt();
	int arr[]  = new int [n];
 	for(int i =0 ;i< n ; i++)
		arr[i] = sc.nextInt();
    System.out.println("Before Deletion  ");
    for(int i =0 ;i< n ; i++)
		System.out.print(arr[i] + " ");
    System.out.println();
    int k = 3 ; // deletion index
    for(int i =k ;i< n -1 ; i++)
		arr[i] = arr[i+1];
    arr[n-1] = 0;
    System.out.println("After Deletion "+k+"index ");
    for(int i =0 ;i< n ; i++)
		System.out.print(arr[i] + " ");
    System.out.println();
 	 
	}

}
