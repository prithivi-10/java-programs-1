import java.lang.*;
import java.util.Scanner;

public class string_decimal {

    public static String convertBinaryFunction(String str) {

        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)=='a') 
                str=str.replace('a', '1');
            else   
                str=str.replace('b', '0');
        }

        return str;
    }

    public static int convertIntegerNumber(String num) {

        return Integer.parseInt(num, 2);
    }
    public static void main(String a[]) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java program to print the value of number after changing to the binaryString");
        System.out.println("======================================\n");

        System.out.println("Enter the string:");
        String str=sc.nextLine();

        String binaryCode=convertBinaryFunction(str);

        System.out.println("String after the conversion of the binary Code is :");
        System.out.println(binaryCode);

        int result=convertIntegerNumber(binaryCode);

        System.out.println("The resultant will be == ");
        System.out.println(result);
    }
}