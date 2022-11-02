import java.util.*;
import java.lang.*;

public class stringReverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Java program to reverse:");
        System.err.println("========================");

        String str;

        System.out.println("\nEnter the String to convert to the StringBuilder:");
        str=sc.nextLine();

        StringBuilder sb=new StringBuilder(str);

        //sb.append(str);

        System.out.println("Reverse of the string is= "+sb.reverse()+"\n");

    }
}