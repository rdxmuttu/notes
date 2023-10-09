import java.util.Scanner;
class Array1{
       public static void main(String [] args)
       {
	int []nums = new int[5];
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the numbers:");
	
        //int num=scan.nextInt();
	for(int index=0;index<nums.length;index++)
	nums[index]+=5;
	for(int index=0;index<nums.length;index++)
	System.out.println(nums[index]);
	
       
	
   }
} 