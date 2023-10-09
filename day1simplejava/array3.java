import java.util.Scanner;
class array3{
       public static void main(String [] args)
       {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number of elements:");
	int num=scan.nextInt();
	int []nums = new int[num];
        System.out.println("Enter the numbers:");
	for(int index=0;index<num;index++)
	 nums[index]=scan.nextInt();
	int max=nums[0];
	int max2=nums[0];
	for(var item : nums)
	{
	if(item>max)
	 max=item;
	}
        for(int index=0;index<num;index++)
{
if((nums[index]>max2)&& (nums[index] != max))
max2=nums[index];
}


System.out.println("Second Largest number is "+max2);
	
       
	
   }
} 