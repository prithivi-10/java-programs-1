import java.util.*;

public class reversePrinting {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java program to print the string in reverse by step by step:");
        System.out.println("============================================================");

        System.out.println("\nEnter the String:");

        String str=sc.nextLine();

        int length=str.length();


        System.out.println("The expected output is ");
        for(int i=1;i<=length;i++) {
            System.out.print(str.substring(length-i));

        }
  
    }
}