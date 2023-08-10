import java.lang.*;
import java.util.*;

public class consonants_in_range {

    public static ArrayList<Character> function(char ch1,char ch2) {

        ArrayList<Character> al=new ArrayList<>();

        if(ch2>ch1) {
            for(char i=ch1;i<=ch2;i++) {
                if(i=='a' ||i=='e' ||i=='i' ||i=='o' ||i=='u' )
                    continue;
                else 
                    al.add(i);
            }
        }
        else {
            for(char i=ch1;i>=ch2;i--) {
                if(i=='a' ||i=='e' ||i=='i' ||i=='o' ||i=='u' )
                    continue;
                else 
                    al.add(i);
            }

        }
        return al;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java program to print the consonants from the given range");
        System.out.println("====================================================\n");


        System.out.println("Enter the first character:");
        char first_char=sc.next().charAt(0);
        System.out.println("Enter the second character:");
        char second_char=sc.next().charAt(0);

        ArrayList<Character> al=function(first_char,second_char);

        System.out.print("The resultant will be == ");
        for(char x:al) {
            System.out.print(x+" ");
        }


    }
}