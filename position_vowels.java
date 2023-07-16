import java.lang.*;
import java.util.*;

public class position_vowels {

	public static ArrayList<Integer>  method(String str) {

		ArrayList<Integer> al=new ArrayList<>();

		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				al.add(i+1);
			}
				
		}

		return al;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Java program to print positions of the string::");
		System.out.println("----------------------------------------------------\n");

		System.out.println("Enter the String::");
		String str=sc.nextLine();

		ArrayList <Integer> al=method(str);

		System.out.println("The result will be::");
		if(al.isEmpty()) {
			System.out.println(-1);
		}
		else {
			System.out.println(al);
		}

	}
}