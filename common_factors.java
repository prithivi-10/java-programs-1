import java.lang.*;
import java.util.*;

public class common_factors {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java proram to print the numbers of the common divisers:");
        System.out.println("=======================================================/n");

        System.out.println("Enter the first number:");
        int firstNum=sc.nextInt();
        System.out.println("Enter the second number:");
        int secondNum=sc.nextInt();
        int max=0;

        if(firstNum > secondNum) {
            max=firstNum;
        }
        else {
            max=secondNum;
        }

        ArrayList<Integer> al=new ArrayList<>();

        for(int i=1;i<=max;i++) {
            if(firstNum%i==0 && secondNum%i==0) {
                al.add(i);
            }
        }

       Collections.reverse(al);
       System.out.println("The resulant will be as::");
       System.out.println(al);


    }
}
