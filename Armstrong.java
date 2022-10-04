import java.util.*;
public class Armstrong {
    public static void main(String args[]) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter the number to check the amstrong or not :");
        int num=scan.nextInt();

        int copy_num=num;
        int arm=0;

        while(num!=0) {
            int r=num%10;
            arm=arm+(r*r*r);
            num=num/10;

        }
        if (arm==copy_num) {
            System.out.println("Yes it is a armstrong number");
        }
        else {
            System.out.println("No it is not a armstrong number");
        }
       
    }
    
}
