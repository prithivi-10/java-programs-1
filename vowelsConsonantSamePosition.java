import java.util.*;

public class vowelsConsonantSamePosition {

    public static int[] conversion(char arr[]) {

        int numberArray[]=new int[arr.length];

        for(int i=0;i<numberArray.length;i++) {
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'||arr[i]=='u') {
                numberArray[i]=1;
            }
            else {
                numberArray[i]=0;
            }
        }
        return numberArray;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s1=sc.nextLine();
        String s2=sc.nextLine();

        if(s1.length()==s2.length()) {


            char s1Array[]=s1.toCharArray();
            char s2Array[]=s2.toCharArray();

            int first[]=conversion(s1Array);
            int second[]=conversion(s2Array);

            for(int i=0;i<first.length;i++) {
                if(first[i]==second[i]) {
                    continue;
                } else {
                    System.out.println("NO");
                    System.exit(0);
                }
            }

            System.out.println("YES");

        }else {
            System.out.println("Please Enter the teo String in same length");
        }




    }
}