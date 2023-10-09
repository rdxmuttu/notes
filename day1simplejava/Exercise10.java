import java.util.Scanner;
class Exercise10{
       public static void main(String [] args)
       {
	int age;
	System.out.println("Enter your age:"); 
	Scanner scan = new Scanner(System.in);
        age = scan.nextInt();
  	String output = "";
	if ((age<1)||(age>120)){
	output ="Invalid age";
        }
	else if((age>=1)&&(age<=12)){
	output ="User is a kid";
	}
	else if((age>=13)&&(age<=19)){
	output ="User is a teenager";
	}
	else if((age>=20)&&(age<=60)){
	output ="User is a adult";
	}
	else{
	output =" User is a senior citizen ";
	}
	System.out.println(output);
       }
} 