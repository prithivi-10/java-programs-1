import java.util.*;

public class unique_or_not {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program to check whether it is unique or not:");
        System.out.println("---------------------------------------------");

        System.out.println("Enter the size of an array:");
        int num=sc.nextInt();
        int arr[]= new int[num];

        System.out.printf("Enter the %d elements:\n",num);
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("The elements in the array are:");
        for(int x:arr) {
            System.out.print(x+" ");
        }

        System.out.println("");
        int t=0;
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]==arr[j]) {
                    t=1;
                }
            }
        }
        if(t==0) {
            System.out.println("Yes it is unique");
        }
        else {
            System.out.println("No it is not unique");
        }


    }
}