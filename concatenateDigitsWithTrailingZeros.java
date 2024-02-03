import java.lang.*;
import java.util.*;

public class concatenateDigitsWithTrailingZeros {
    public static int concatenateDigitsWithTrailingZero(LinkedList<Integer> al,int n) {

        String s1="";
        String s2="";

        for(int i=0;i<n;i++) {
            if(al.get(i)==0)
                s2+=Integer.toString(al.get(i));
            else 
                s1+=Integer.toString(al.get(i));
        }

        StringBuilder ss1=new StringBuilder(s1);
        StringBuilder ss2=new StringBuilder(s2);

        ss1.append(ss2);

        return Integer.parseInt(ss1.toString());
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Javap Program to concatenate the non-zero and zeros at the last:");
        System.out.println("===============================\n");

        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();

        LinkedList <Integer> ll=new LinkedList<>();

        System.out.println("Enter the "+n+" elements for the array:");
        for(int i=0;i<n;i++) {
            ll.add(sc.nextInt());
        }

        System.out.println("The Entered elements in the array are =="+ll);

        int result=concatenateDigitsWithTrailingZero(ll, n);

        System.out.println("The result will be == "+result);
    }
}