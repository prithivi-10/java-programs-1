import java.lang.*;
import java.util.*;

public class AbbreviationMatching {

    public static String method(String str[],int n,String aString) {
        boolean t=true;

        for(int i=0;i<str.length;i++) {
            String tempString=str[i];

            String tempStringArr[]=tempString.split(" ");

            for(int j=0;j<tempStringArr.length;j++) {
                if(aString.charAt(j)==tempStringArr[j].charAt(0)) {
                    t=true;
                }
                else {
                    t=false;
                    break;
                }

            }
            if(t==true){
                return tempString;
            }
        }

        return null;
    }
    public static void main(String ar[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("The java program to print the correct abbravation String");
        System.out.println("==================================\n");
        
        System.out.println("Enter the number of Strings:");
        int n=sc.nextInt();
        sc.nextLine(); 

        String str[]=new String[n];
      
        for(int i=0;i<str.length;i++) {
            System.out.print("Enter the "+(i+1)+" String = ");

            str[i]=sc.nextLine();
        }
      

        System.out.println("Enter the Abbrevation Word:");
        String abbrevationString=sc.nextLine();

        System.out.println(abbrevationString);

        System.out.println("Entered Strings are = "+Arrays.toString(str));

        String result=method(str,n,abbrevationString);

        System.out.println("\nThe Resulatant String will be = "+result);
    }
    
}