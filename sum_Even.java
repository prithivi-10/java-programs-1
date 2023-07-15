import java.lang.*;
import java.util.*;


public class freak {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Java progrsm to print value sfrom x to y if sum is even::");
		System.out.println("----------------------------------------------------------/n");


		System.out.println("Enter the first number");
		int firstNum=sc.nextInt();
		System.out.println("Enter the second number");
		int secondNum=sc.nextInt();

		int sum=0;

		System.out.println("The result will be::");
		for(int i=firstNum;i<=secondNum;i++) {
			sum=(i%10)+(i/10%10);
			if(sum%2==0) System.out.print(i+" ");
		}
	}
}
