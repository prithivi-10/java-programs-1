import java.util.*;

public class Reverse_Star_Pattern {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of stars to get decreased:");
        int num=sc.nextInt();

       
        
        System.out.println("The stars can be printed as follows:");
       for(int i=num;i>=1;i--) {
        for(int j=i;j>=1;j--) {
            System.out.print("* ");
        }
        System.out.println("");
       }

    }



}