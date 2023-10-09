package problems_with_arrays;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

public class problem2 {
	private static void getCheckSame(List<Integer> arr1, List<Integer> arr2) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < arr1.size(); i++) {
			for (int j = 0; j < arr2.size(); j++) {
				if (arr1.get(i).equals(arr2.get(j)))
					result.add(arr1.get(i));
			}
		}
		System.out.println("result array is:");
		for (int arr3 : result)
			System.out.println(arr3);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size and first array");
		List<Integer> arr1 = new ArrayList<>();
		int s1 = sc.nextInt();
		for (int u = 0; u < s1; u++) {
			arr1.add(sc.nextInt());
		}
		System.out.println("Enter the size and second array ");
		List<Integer> arr2 = new ArrayList<>();
		int s2 = sc.nextInt();
		for (int k = 0; k < s2; k++) {
			arr2.add(sc.nextInt());
		}
		getCheckSame(arr1, arr2);
	}
}