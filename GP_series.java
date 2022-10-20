import java.util.*;
public class GP_series {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the starting number:");
        int a=sc.nextInt();

        System.out.println("Enter the common difference:");
        int r=sc.nextInt();

        System.out.println("Enter the number of terms:");
        int num=sc.nextInt();

        int term=a;
        for(int i=0;i<num;i++) {
            System.out.print(term+",");
            term=term*r;
        }

    }
}