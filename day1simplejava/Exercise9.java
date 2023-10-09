import java.util.Scanner;
class Exercise9{
       public static void main(String [] args)
       {
	int num1,num2,num3;
	System.out.println("Enter the numbers:"); 
	Scanner scan = new Scanner(System.in);
        num1 = scan.nextInt();
	num2 = scan.nextInt();
	num3 = scan.nextInt();
	if ((num1>num2)&&(num1>num3)){
	System.out.println("Highest number is "+num1);
        }
	else if((num1>num2)&&(num1<num3)){
	System.out.println("Highest number is "+num3);
	}
	else{
	System.out.println("Highest number is "+num2);
	}
       }
} 