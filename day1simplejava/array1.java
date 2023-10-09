import java.util.Scanner;
class array1{
       public static void main(String [] args)
       {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number of elements:");
	int num=scan.nextInt();
	int []nums = new int[num];
        System.out.println("Enter the numbers:");
	for(int index=0;index<num;index++)
	 nums[index]=scan.nextInt();
	for(var item : nums)
	System.out.print(item+"\t");
	
       
	
   }
} 