import java.util.*;

public class Digits_in_words {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to display in words:");
        int number=sc.nextInt();

       String str="";
       
       while(number>0) {
        int r=number%10;
        str=str+r;
        number=number/10;
       }
       char c;
       for(int i=str.length()-1;i>=0;i--) {
            c=str.charAt(i);
           // System.out.println(c);
            switch(c) {
                case '0': System.out.println("zero");
                break;

                case '1': System.out.println("one");
                break;

                case '2': System.out.println("two");
                break;

                case '3': System.out.println("three");
                break;

                case '4': System.out.println("four");
                break;

                case '5': System.out.println("five");
                break;

                case '6': System.out.println("six");
                break;

                case '7': System.out.println("seven");
                break;

                case '8': System.out.println("eight");
                break;

                case '9': System.out.println("nine");
                break;

               

            }   
       }

    }
}