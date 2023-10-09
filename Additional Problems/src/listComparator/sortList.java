package listComparator;

import java.util.*;

public class sortList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> item = new LinkedList<>();
//				
//		System.out.println("Enter the item number:");
//		int n=scan.nextInt();
		System.out.println(" items:");
		item = (Arrays.asList("Gaurav", "Suraj", "Raj", "Bob", "Karan"));
		Collections.sort(item, (s1, s2) -> s2.compareTo(s1));//descending sort
		System.out.println(item);
		
		
		List<Integer> numbers = new LinkedList(List.of(10, 22, 3, 56, 27));
		// List.of used only in single line initialisation
		System.out.println(" numbers:");
		Collections.sort(numbers, (s1, s2) -> s2 - s1);// or->s2.compareTo(s1)
		System.out.println(numbers);
		
		
		Comparator<String> comp = (s1, s2) -> {
			if (s1.length() == s2.length())
				return s1.compareTo(s2);//ascending sort
			else
				return s1.length() - s2.length();//length sort
		};
		System.out.println(" items:");
		Collections.sort(item, comp);
		System.out.println(item);
		// for(String str:items)
		// System.out.println(str.length());

	}

}
