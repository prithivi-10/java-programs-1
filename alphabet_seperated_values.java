import java.lang.*;
import java.util.*;

public class alphabet_seperated_values {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java program to print the sum of integers only");
        System.out.println("=================================================\n");

        System.out.println("Enter the String:");
        String str=sc.nextLine();
        int sum=0;

        String str_arr[]=str.split("[a-zA-Z]+");

        for(int i=0;i<str_arr.length;i++) {
            sum+=Integer.parseInt(str_arr[i]);
        }

        System.out.println("The result will be :::");
        System.out.println(sum);

        
        
    }
}