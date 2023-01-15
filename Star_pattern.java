import java.util.*;

public class Star_pattern {
    public static void main(String args[]) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter the lines of the pattern:");
        int num=scan.nextInt();

        System.out.println("The star pattern can be printed as:");

        for(int i=1;i<=num;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("^ ");
            }
            System.out.println();
        }
    }


}