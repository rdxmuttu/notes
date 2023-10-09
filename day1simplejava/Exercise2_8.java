import java.util.Scanner;
class Exercise2_8{
       public static void main(String [] args)
       {
	int op;
	float num1,num2,res=0;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the first number:"); 
	num1 = scan.nextFloat();
	System.out.println("Enter the second number:"); 
	num2 = scan.nextFloat();
	System.out.println(" 1.Add \n 2.Subtract \n 3.Multiply \n 4.Divide"); 
	System.out.println("Enter the number beside operation to perform:"); 
	op = scan.nextInt();
	
	switch(op)
	{
	case 1 : res=num1+num2;System.out.println(num1+"+"+num2+"="+res);break;
	case 2 : res=num1-num2;System.out.println(num1+"-"+num2+"="+res);break;
	case 3 : res=num1*num2;System.out.println(num1+"*"+num2+"="+res);break;
	case 4 : res=num1/num2;System.out.println(num1+"/"+num2+"="+res);break;
	
	default : System.out.println("Invalid Input");
	}
	
	
       }
} 