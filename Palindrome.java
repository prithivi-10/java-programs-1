import java.util.Scanner;

public class Palindrome{
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a number to check palindrome or not ");
        int x=scan.nextInt();

        int copy=x;
        int rev=0;

        while(copy!=0) {
            int r=copy%10;
            rev=rev*10+r;
            copy=copy/10;

        }
        if(rev==x) {
            System.out.println("Yes it is a palindrome");
        }
        else {
            System.out.println("No it is not a palindrome");
        }

    }




}