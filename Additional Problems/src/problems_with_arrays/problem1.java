package problems_with_arrays;

import java.util.*;

public class problem1 {
	public static Map<Integer, Integer> findPair(int[] nums, int sum) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (sum == nums[i] + nums[j])
					map.put(nums[i], nums[j]);
			}
		}
		return map;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no. of values");
		int size = sc.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter total no. of values");
		for (int i = 0; i < size; i++)
			nums[i] = sc.nextInt();
		System.out.println("Enter target sum");
		int sum = sc.nextInt();
		Map<Integer, Integer> map = findPair(nums, sum);
		System.out.println("Pair of numbers are:");
		for (int key : map.keySet())
			System.out.println(key + "," + map.get(key));
	}
}
