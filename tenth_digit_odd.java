import java.lang.*;
import java.util.*;

public class tenth_digit_odd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Java program to remove and print the integer");
		System.out.println("-----------------------------------------------\n");

		System.out.println("Enter the number:");
		int n=sc.nextInt();

		while(true) {
			if((n/10%10)%2==0) {
				n=n/10;	
			}else {
				break;
			}

		}
		//System.out.println("hai");

		System.out.println("The result will be :::");
		System.out.println(n);







	}

}