import java.util.*;
import java.lang.*;

public class max_no_1s {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Jav aprogram to print the row line which has the greater number of 1's");
		System.out.println("==================================================================\n");

		System.out.println("Entter the number of row and columns:");

		int num=sc.nextInt();

		int arr[][]=new int[num][num];

		int sum=0;
		int count=0;

		System.out.println("Enter the "+num+" elements in the matrix::");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
				if(arr[i][j]==1) {
					count++;
				}
			}
			if(sum<count) {
				sum=i+1;
			}
			count=0;
		}

		System.out.println("The resultant will be::");
		System.out.println(sum);


		
		
	}
}