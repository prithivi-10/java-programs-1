import java.lang.*;
import java.util.*;

public class getSumRemainder {

	public static int getSumRemainder(int arr[],int n) {

		int even=0;
		int odd=0;

		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				even+=arr[i];
			else 
				odd+=arr[i];
		}

		return odd%even;

	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Java program to print the remainder of even and the odd numbers in array:");
		System.out.println("=========================================\n");

		System.out.println("Enter the size of array");
		int n=sc.nextInt();

		int arr[]=new int[n];

		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}

		System.out.println("The elements in the array are "+Arrays.toString(arr));

		int answer=getSumRemainder(arr, n);

		System.out.println("The result will be == "+answer);

		

	}
}