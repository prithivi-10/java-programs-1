import java.util.*;

class Counting {
    public int numberOfLetter(String word) {
        String given=word;
        int count=0;

        for(int i=0;i<given.length();i++) {
            if(Character.isLetter(given.charAt(i))) {
                count++;
            }

        }
        return count;

    }

}
public class numberOfWordsInString {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Program to count the number of words in String");
        System.out.println("----------------------------------------------");
        System.out.println("");

        Counting obj = new Counting();

        System.out.print("Enter the alphabets with numbers to count the number of letters:");
        String str=sc.nextLine();
        

        int number=obj.numberOfLetter(str);


        System.out.println("Number of words in the given String is="+number);
        System.out.println("");

    }
}