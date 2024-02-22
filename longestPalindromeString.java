import java.lang.*;
import java.util.*;

public class longestPalindromeString {

    public static int method(String arr[]){

        ArrayList<String> al=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            String str=arr[i];
            int first=0;
            int last=str.length()-1;
            boolean temp=true;
            int mark=0;

            while(temp){

                if(str.charAt(first)==str.charAt(last)){
                    mark=1;
                }
                else{
                    mark=0;
                    temp=false;
                }
                first++;
                last--;
                if(first==last){
                    temp=false;
                }
            }
            if(mark==1){
                al.add(str);
            }

        }
        for(int i=0;i<arr.length;i++){
            String str=arr[i];
            int count=0;
            for(int ii=0;ii<str.length();ii++) {
                count++;
            }
            res.add(count);
        }
        Collections.sort(res);

        return res.get(res.size()-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java program to print length of the largest palindrome\n");
        System.out.println("========================================\n");

        System.out.println("Enter the number of String");
        int num=sc.nextInt();

        String arr[]=new String[num];

        sc.nextLine();
        System.out.println("Enter the "+num+" Strings");
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextLine();
        }


        int result=method(arr);
        System.out.println("\nThe result will be = "+result);

    }
}