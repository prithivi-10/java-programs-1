import java.math.MathContext;
import java.util.*;

public class squarerootCheck {

    static String concatenate(int number1,int number2) {
        int num1=number1;
        int num2=number2;

        String concate1=Integer.toString(num1);
        String concate2=Integer.toString(num2);

        return concate1+concate2;

    }

    static void squareRoot (String num1,String num2) {

        String numberString1=num1;
        String numberString2=num2;
        int k=Integer.parseInt(numberString1);
        int kk=Integer.parseInt(numberString2);

        double first=Math.sqrt(k);
        double second=Math.sqrt(kk);

        if(first-Math.floor(first)==0 || second-Math.floor(second)==0)
            System.out.println("yes");
        else 
            System.out.println("no");


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        int number1=sc.nextInt();
        int number2=sc.nextInt();


        //for concatenate the two strings:

        String str1=concatenate(number1, number2);
        String str2=concatenate(number2, number1);

        // for calculating the squareroot or not:


        squareRoot(str1,str2);




        
    }
}