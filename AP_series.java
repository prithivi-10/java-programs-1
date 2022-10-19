import java.util.Scanner;
public class AP_series {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the starting number:");
        int a=sc.nextInt();

        System.out.println("Enter the common difference:");
        int d=sc.nextInt();

        System.out.println("Enter the number of terms:");
        int n=sc.nextInt();

        System.out.println("AP series is--------");

        int term=a;
        for(int i=0;i<n;i++) {
            System.out.print(term+",");
            term=term+d;

        }
    }
   
}