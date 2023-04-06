import java.util.*;

public class comeback {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int row=sc.nextInt();
		int col=sc.nextInt();

		int arr[][]=new int[row][col];

		System.out.println("Enter the elements ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}

		System.out.println("Entered elements are");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("\nResultant matrix is ");
		int sum=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {

				if(i==row-1 && j==col-1) {
					sum=arr[i][j];
				}
				else if(j==col-1) {
					sum=arr[i+1][j];
				}
				else if(i==row-1) {
					sum=arr[i][j+1];
				}
				else {
					sum=arr[i+1][j]+arr[i][j+1];
				}
			
				System.out.print(sum+" ");

			}
			System.out.println();
		}

		

	}
}