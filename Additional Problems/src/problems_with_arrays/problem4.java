package problems_with_arrays;

import java.util.*;

public class problem4 {

	static int[] sortCommonElements(int[] arr1, int[] arr2) {
		Set<Integer> numSet = new LinkedHashSet<>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					numSet.add(arr1[i]);
				}
			}
		}
		int[] result = new int[numSet.size()];
		int k = 0;
		for (int num : numSet) {
			result[k] = num;
			k++;
		}
		for (int i = 0; i < result.length - 1; i++) {
			for (int j = 0; j < result.length - i - 1; j++) {
				if (result[j] > result[j + 1]) {
					int temp = result[j];
					result[j] = result[j + 1];
					result[j + 1] = temp;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of 1st array");
		int size1 = sc.nextInt();
		int[] arr1 = new int[size1];
		System.out.println("Enter " + size1 + " numbers");
		for (int i = 0; i < size1; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter the length of 2nd array");
		int size2 = sc.nextInt();
		int[] arr2 = new int[size2];
		System.out.println("Enter " + size2 + " numbers");
		for (int i = 0; i < size2; i++) {
			arr2[i] = sc.nextInt();
		}
		int[] result = sortCommonElements(arr1, arr2);
		System.out.println(Arrays.toString(result));
	}
}
