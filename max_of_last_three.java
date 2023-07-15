import java.lang.*;
import java.util.*;

public class max_of_last_three {
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);

          System.out.println("Java program to print max number::");
          System.out.println("=========================================\n");

          System.out.println("Enter the long number");
          long number=sc.nextLong();

          ArrayList<Long> al=new ArrayList<>();

          al.add(number%10);
          al.add(number/10%10);
          al.add(number/100%10);

          Collections.sort(al);

          System.out.println("The result will be::");
          System.out.println(al.get(al.size()-1));


     }
}