import java.util.*;
public class unitDigitsSum {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java program to print the sum of occuring numbers:");
        System.out.println("==================================================");

        System.out.println("\nEnter the ending number:");
        int n=sc.nextInt();

        System.out.println("Enter the unti digit number:");
        int d=sc.nextInt();

        int sum=0;

        for(int i=1;i<=n;i++) {
            if(i%10==d) {
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