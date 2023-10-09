import java.util.Scanner;
class Exercise12{
       public static void main(String [] args)
       {
	int day;
	System.out.println("Enter the day number:"); 
	Scanner scan = new Scanner(System.in);
        day = scan.nextInt();
	String message="";
	switch(day)
	{
	case 1 : message="Monday - its time to start the week";break;
	case 2 : message="Tuesday - second day";break;
	case 3 : message="Wednesday - mid week";break;
	case 4 : message="Thursday - towards weekend";break;
	case 5 : message="Friday - done with the week";break;
	case 6 : message="Saturday - Enjoy your weekend";break;
	case 7 : message="Sunday - Plan for the upcoming week";break;
	default : message="Invalid Input";
	}
	System.out.println(message);
	
	
       }
} 