import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class RENTLY_INTERVIEW_PROGRAM {

     //method for logic:
      public static String logic(int m,List<String> arr) {
          int kk=m;
          int sum=0;
          
               for(int i=0;i<arr.size();i++) {
                    String str=arr.get(i);  //getting the first String
                    char chArray[]=str.toCharArray();  //String to char array
                    int ord[]=new int[chArray.length];  //array for ASCII value of String
                    long valueArray[]=new long[ord.length];  //for calculating the valueArrays
     
                    for(int j=0;j<ord.length;j++) {
                         int asciiValue=(int)(chArray[j]);
                         ord[j]=(int)(Math.pow(asciiValue,kk));  //multiple the ascii value of char by m times
                          
                    }

                    for(int k=0;k<ord.length;k++) {

                         if(k==0) {
                              valueArray[k]=ord[0];
                         }
                         else {
                              valueArray[k]=valueArray[k-1]*ord[k];
                         }
                        sum+=valueArray[k];
                    }

               }
               if(sum%2==0) 
                    return "EVEN";
               else 
                    return "ODD";
          }


     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);

          System.out.println("This the first company 'RENTLY' I attended in the campus for the placements:");
          System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");

     
          //creating ths ListArray for the problem:
          List<String> s=new ArrayList<>();

          System.out.print("Enter the size of the ArrayList (not mandatory but used only the getting number of inputs:) = ");
          int size=sc.nextInt();



          //adding the elements :
          System.out.println("Enter the "+size+" Strings");
          for(int i=0;i<size;i++) {
               System.out.print("String for "+i+" = ");
               String str=sc.next();
               s.add(str);
          }

          System.out.print("Enter the num to get Multpily = ");
          int m=sc.nextInt();

          System.out.println("\nThe Result may be either 'EVEN' or 'ODD' ");

          System.out.println("\nThe final OUTPUT will be ");    
          //calling the method:
          System.out.println(logic(m,s));

          


     }
}