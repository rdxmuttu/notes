import java.util.Scanner;
class array4{
       public static void main(String [] args)
       {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number of elements:");
	int num=scan.nextInt();
	int []nums = new int[num];
        System.out.println("Enter the numbers:");
	for(int index=0;index<num;index++)
	 nums[index]=scan.nextInt();
	
        for(int i=0;i<num-1;i++){
	  for(int j=i+1;j<num;j++)
	{
	if(nums[i]>nums[j])
	{
	int temp=nums[i];
	nums[i]=nums[j];
	nums[j]=temp;
	}
	}
	 }
	for(var name : nums)
	System.out.print(name +"\t");
	
   }
} 