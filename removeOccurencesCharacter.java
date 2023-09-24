import java.util.*;

public class removeOccurencesCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java program to remove the characters from the letters");
        System.out.println("---------------------------------------------------\n");

        System.out.println("Enter the String");
        StringBuilder sb=new StringBuilder(sc.nextLine());
        System.out.println("Enter the character");
        char ch=sc.next().charAt(0);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int temp=0;


        for(int i=0;i<sb.length();i++) {
            if(sb.charAt(i)==ch && temp!=num) {
                sb.deleteCharAt(i);
                temp++;
            }
        }

        System.out.println("The resultant will be ");
        System.out.println(sb.toString());





    }
}