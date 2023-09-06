import java.lang.*;
import java.util.*;

public class alternate_characters_from_p {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Java program to print the alternate characters:");
        System.out.println("----------------------------------------\n");

        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("Enter the starting position:");
        int p=sc.nextInt();

        str=str.substring(p-2,str.length());
       

        String new_str="";

        for(int i=0;i<str.length();i++) {
            if(i%2!=0)
                new_str+=str.charAt(i);
        }

        System.out.println("The result will be :::");
        System.out.println(new_str);
    }
}