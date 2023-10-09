import java.util.Scanner;
class Exercise14{
       public static void main(String [] args)
       {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number:");
	int num=scan.nextInt();
	
	int product=1; 
	for(int count=1;count<=10;count++)
	{
	product=num*count;
	System.out.println(num+"x"+count+"="+product);        
	
	}
	}
} 