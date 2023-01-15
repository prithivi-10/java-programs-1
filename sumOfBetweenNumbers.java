import java.util.*;
public class sumOfBetweenNumbers {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java program to print the sum of multiples in between numbers:");
        System.out.println("==============================================================");

        System.out.println("\nEnter the Starting number:");
        int start=sc.nextInt();

        System.out.println("Enter the Ending number:");
        int end=sc.nextInt();

        System.out.println("Enter the multiple:");
        int multiple=sc.nextInt();

        int sum=0;

        for(int i=start;i<=end;i++) {
            if(i%multiple==0) {
                sum+=i;
            }
        }



        System.out.println("The sum of the number is:");
        if(sum==0) {
            System.out.println("-1");
        }
        else {
            System.out.println(sum);
        }

        
  
    }
}