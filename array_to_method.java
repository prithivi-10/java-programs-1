import java.util.*;
import java.lang.*;



class Solution {
    public int method(int arr[]) {
       
       int max=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) {
                max=arr[i];
            }
            
        }
        return max;
        
    }
    //return max;
}

public class array_to_method
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Program for passing arrys to methods:");
	    System.out.println("-------------------------------------\n");
	    
	    int size;
	    
	    System.out.println("Enter the size of array:");
	    size=sc.nextInt();
	    int arr[] = new int[size];
	    
	    System.out.printf("Enter the %d elements for array:\n",size);
	    
	    for(int i=0;i<arr.length;i++) {
	        arr[i]=sc.nextInt();
	    }
	    
	    Solution oo = new Solution();
	    
	    System.out.println("Max element is:"+oo.method(arr));
	    
	    
	    
		
	}
}