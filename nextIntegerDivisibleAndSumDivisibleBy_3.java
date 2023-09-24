import java.util.*;

public class nextIntegerDivisibleAndSumDivisibleBy_3 {

	public static int sumMethod(int num) {

		int sum=0;

		while(num!=0) {
			sum+=num%10;
			num/=10;
		}
		
		return sum;
	}


	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Java program to print the next number which is divisible by 3 and sum divisible by 3");
		System.out.println("====================================================================\n");

		System.out.println("Enter the number");
		int number=sc.nextInt();
		number=number+1;
		boolean temp=true;

		while(temp) {
			if(number%3==0 && sumMethod(number)%3==0) {
				System.out.println("The resultant will be ::");
				System.out.println(number);
				temp=false;
			}
			else 
				number++;
		}

	}
}