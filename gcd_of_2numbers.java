import java.util.*;

public class gcd_of_2numbers {

    static int gcd(int m,int n) {
        while(m!=n) {
            if(m>n) 
            m=m-n;

            else
            n=n-m;
        }
        return m;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Program to find the GCD of two numbers:");
        System.out.println("=====================================");
        System.out.println("");

        System.out.println("Enter the two numbers to find the GCD:");
        System.out.println("");

        System.out.println("Enter the first number:");
        int num=sc.nextInt();

        System.out.println("Enter the second number:");
        int num2=sc.nextInt();

        System.out.printf("The GCD of %d and %d is: ",num,num2);
        System.out.println(gcd(num,num2));

 
    }
}