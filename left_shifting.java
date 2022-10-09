import java.util.*;

public class left_shifting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("PROGRAM IS TO ROTATE THE ARRAY BY LEFT:");
        System.out.println("---------------------------------------");

        System.out.println("Enter the size of an array:");
        int size=sc.nextInt();
        int prithivi[]= new int[size];

        System.out.printf("Enter the %d elements of an array:\n",size);

        for(int i=0;i<prithivi.length;i++) {
            prithivi[i]=sc.nextInt();
        }
    
        System.out.println("The elements in the after inserting:");
        for(int x:prithivi) {
            System.out.print(x+" ");
        }
        System.out.println();

        System.out.println("Elements after shifting left:");
        int temp=prithivi[0];

        for(int i=1;i<prithivi.length;i++) {
            prithivi[i-1]=prithivi[i];
        }
        prithivi[size-1]=temp;

        for(int x:prithivi) {
            System.out.print(x+" ");
        }


    }
}