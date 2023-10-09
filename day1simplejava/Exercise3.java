import java.util.Scanner;
class Exercise3{
       public static void main(String [] args)
       {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the numbers:");
	
	float sum=0; 
	for(int count=0;count<5;count++)
	{
        float num=scan.nextFloat();
	
	if (num<0)
	{
	continue;
	}
	sum+=num;
	}
	System.out.println("Sum is "+sum);
	float avg=sum/5;
	System.out.println("Average is "+avg);
       }
} 