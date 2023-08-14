import java.lang.*;
import java.util.Scanner;

public class remove_char_from_string {

    public static String function(String str,char ch) {

        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)==ch) {
                str=str.replace(Character.toString(ch), "");
            }
        }


        return str;
    }
    public static void main(String a[]) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java progrm to print remove the char in the given String");
        System.out.println("-------------------------------------------\n");

        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("Enter the character:");
        char ch=sc.next().charAt(0);

        String result=function(str,ch);

        System.out.println("The resultant String will be = "+result+"\n");



    }
}