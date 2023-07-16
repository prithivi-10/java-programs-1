import java.lang.*;
import java.util.*;

public class string_sort_length {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java program to arrange the strings basend on their length of the String::");
        System.out.println("--------------------------------------------------------------------------------\n");

        System.out.println("Enter the number of string::");
        int num=sc.nextInt();
        sc.nextLine();

        String arr[]=new String[num];

        System.out.println("Enter the "+num+" strings::");
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextLine();
        }

        String temp;

        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i].length()>=arr[j].length()) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("The resulatant array will be::\n"+Arrays.toString(arr));
        

    }
}