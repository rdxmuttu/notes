package problems_with_arrays;
import java.util.*;
public class problem5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of students who attended the exam");
		int a = sc.nextInt();
		int arr1[] = new int[a];
		int arr2[] = new int[4];
		int count1 = 0,count2 = 0,count3 = 0,count4 = 0,count5 = 0;
		System.out.println("ENTER MARKS OF " + a + " students");
		for (int i = 0; i < a; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("enter the 4 cutoff values");
		for (int j = 0; j < 4; j++) {
			arr2[j] = sc.nextInt();
		}
		for (int i = 0; i < a; i++) {
			if (arr1[i] >= arr2[0]) {
				count1++;
			}
			else if (arr1[i] >= arr2[1]) {
				count2++;
			}
			else if (arr1[i] >= arr2[2]) {
				count3++;
			}
			else if (arr1[i] >= arr2[3]) {
				count4++;
			}
			else {
				count5++;
			}
		}
		System.out.println(
				"\nA: " + count1 + "\nB: " + count2 + "\nC: " + count3 + "\nD: " + count4 + "\nFailed: " + count5);
	}
}

//or
//static void MapGrade(int[] arr1, int[] arr2) {
//    Map<Character, Integer> gradeMap = new TreeMap<>();
//    for (int i = 0; i < arr1.length; i++) {
//        for (int j = 0; j < arr2.length; j++) {
//            if (arr1[i] >= arr2[j]) {
//                char grade = (char) ('A' + (3 - j));
//                gradeMap.put(grade, gradeMap.getOrDefault(grade, 0) + 1);
//                break;
//            }
//        }
//    }
//    
//		gradeMap.forEach((k, v) -> System.out.println(k + ":" + v));
//}