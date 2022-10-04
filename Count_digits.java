import java.util.*;
public class Count_digits {

    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a number to reverse:");
        int num=scan.nextInt();

        int rev=0;
        while(num!=0) {
            int r=num%10;
            rev=rev*10+r;
            num=num/10;
        }
        System.out.print("The reverse of the number is :"+rev);

    }

}
