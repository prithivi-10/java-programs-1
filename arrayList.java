import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class arrayList {
	public static void main(String[] args) {

		System.out.println("Java programs for ArrayList");
		System.out.println("============================\n");;
		

		//creating arrayList:
		List<String> al=new ArrayList<>(List.of("I'm Doing in the CONSTRUCTOR")); 
		                                 //loading in constructor can be done only in {-List-}

		//adding elements:
		al.add("p");
		al.add("r");
		al.add("i");
		al.add("t");
		al.add("h");
		al.add("i");
		al.add("v");
		al.add("i");
		al.add(" ");
		al.add("r");
		al.add("a");
		al.add("j");

		System.out.println("Original ArrayLsit = "+al +"\n or \n"+al.toString());

		System.out.println("Getting element = "+al.get(0));
		System.out.println(al.get(10));

		System.out.println("Making seperate sublist : ");

		List <String> sublist = al.subList(1,9);
		System.out.println(sublist);

		System.out.println();

		//List iterator:

		System.out.println("Display using the iterator:");
		Iterator <String> it= al.iterator();

		int i=0;
		while(it.hasNext()) {
			System.out.print(i+++" = "+it.next());

		}

		

		



		
		


	}
}