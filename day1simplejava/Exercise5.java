import java.util.Scanner;
class Exercise5{
       public static void main(String [] args)
       {
	int num1,num2;
	System.out.println("Enter two numbers:"); 
	Scanner scan = new Scanner(System.in);
        num1 = scan.nextInt();
	num2 = scan.nextInt();
	if (num1>num2){
	System.out.println("Highest number is "+num1);
        }
	else if(num1<num2){
	System.out.println("Highest number is "+num2);
	}
	else{
	System.out.println("Both numbers are equal ");
	}
       }
} 