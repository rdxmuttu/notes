import java.util.Scanner;
class Exercise8{
       public static void main(String [] args)
       {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the character:"); 
        char ch=scan.next().toLowerCase().charAt(0);
	if ((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
	{
	System.out.println("the character is a vowel");
	}
	else
	{
	System.out.println("the character is not a vowel");
	}
       }
} 