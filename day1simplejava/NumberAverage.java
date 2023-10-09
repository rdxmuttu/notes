import java.util.Scanner;

public class NumberAverage {

    public static void main(String[] args) {
        NumberAverage obj = new NumberAverage();
        obj.getArrayValues();
    }

    public void getArrayValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of values:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the values:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        String result = findAverage(arr);
        System.out.println(result);
    }

    public String findAverage(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Error the array is empty");
        }

        int sum = 0;
        int count = 0;
        for (int num : arr) {
            if (num <= 0) {
                System.out.println("Give proper positive integer values");
            }
            sum += num;
            //count++;
        }
        double average = (double) sum / arr.length;
	//System.out.println();
        return  "The average value is:"+average;
    }
}
 