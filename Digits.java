import java.util.*;
public class Digits {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number to count :");
        int num=scan.nextInt();

        int count=0;
        while(num!=0) {
            num=num/10;
            count++;
        }

        System.out.println("Number of occurences is: "+count);
        
    }

    
}
