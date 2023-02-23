import java.util.*;
public class sort_two_two_elements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Java program to sort two two numbers:");
		System.out.println("-----------------------------------------\n");

		System.out.println("Enter the size");
		int k=sc.nextInt();

		int arr[]=new int[k];

		System.out.println("Enter the "+k+" elements for the arrys:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}

		System.out.println("\nThe Entered elements in the array are:");
		System.out.println(Arrays.toString(arr));

		int s=0;
		int length=arr.length;

		while(s<=length-1) {

			if(arr[s]>=arr[s+1]) {
				int temp=0;
				temp=arr[s];
				arr[s]=arr[s+1];
				arr[s+1]=temp;
			}
			s=s+2;
		}

		System.out.println("\nThe OUTPUT after sorting of two two elements are:");
		for(int kk:arr) {
			System.out.print(kk+" ");
		}
		//System.out.println(Arrays.toString(arr));

	}
}