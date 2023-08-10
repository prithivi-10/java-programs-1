import java.lang.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class max_on_tenth_digit {

    public static int function(int f,int s,int l) {
        
        ArrayList<Integer> al=new ArrayList<>();
        al.add(f);al.add(s);al.add(l);

        int temp=0;
        int flag=0;

        if(f/10%10 > s/10%10 && f/10%10 > l/10%10) {
            temp=f;
            flag++;
        }
        else if(s/10%10 > l/10%10) {
            temp=s;
            flag++;
        }
        else {
            temp=l;
            flag++;
        }
        if(flag>0) {
            return Collections.max(al);
        }
        return temp;

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Jav aprogram to print the maximum number based on the tenth digit");
        System.out.println("---------------------------------------------\n");

        System.out.println("Enter the first number:");
        int first_number=scan.nextInt();
        System.out.println("Enter the second number:");
        int second_number=scan.nextInt();
        System.out.println("Enter the third number:");
        int third_number=scan.nextInt();

        int result=function(first_number,second_number,third_number);

        System.out.print("The resultant will be = "+result);
    }
}