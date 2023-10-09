import java.util.Scanner;
class Exercise11{
       public static void main(String [] args)
       {
	int num;
	System.out.println("Enter the number:"); 
	Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
	
	if((num%5==0)&&(num%3==0)){
	System.out.println("fizzbuzz");
        }
	else if(num%5==0){
	System.out.println("buzz");
	}
	else if(num%3==0){
	System.out.println("fizz");
	}
	else{
	System.out.println(num);
	}
       }
} 