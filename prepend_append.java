import java.util.*;
public class prepend_append {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Java program to make the prepend and append the given string:");
		System.out.println("==============================================================\n");

		System.out.println("Enter the String:");
		String str=sc.nextLine();

		System.out.println("Enter the character to make prepend and append:");
		char ch=sc.next().charAt(0);

		//logic:
		if(str.charAt(0)!=ch) {
			str=ch+str;
		}
		if(str.charAt(str.length()-1)!=ch) {
			str=str+ch;
		}

		System.out.println("The resultant string will be look like as:");
		System.out.println(str);

	}
}