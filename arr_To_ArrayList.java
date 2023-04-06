import java .util.*;

public class arr_To_ArrayList {

	public static String fun(String arr[]) {

		ArrayList <String> al=new ArrayList<>();  // Or ArrayList<Integer> al=new ArrayList<>(Arrays.asList(al,arr)) 

		Collections.addAll(al,arr);
		al.add("VV");
		al.add("PP");
		al.add("RR");


		return al.get(al.size());


	

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		String arr[]=new String[3];

		arr[0]="viper";
		arr[1]="prithivi";
		arr[2]="professional";

		String sstr=fun(arr);

		System.out.println(sstr);



	}
}