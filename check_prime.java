import java.util.*;

public class check_prime {

    static String isPrime(int n) {
        for(int i=2;i<=n/2;i++) {
            if(n%i==0) {
                return "No it is not a Prime number";
            }
        }
        return "Yes it is Prime number";
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Program to check PRIME NUMBER OR NOT");
        System.out.println("=====================================");

        System.out.println("Enter the number to check prime por not");
        int num=sc.nextInt();

        System.out.println(isPrime(num));

    }
}