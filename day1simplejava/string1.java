import java.util.Scanner;
class string1{
       public static void main(String [] args)
       {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the number of elements:");
	int num=scan.nextInt();
	String []names = new String[num];
        System.out.println("Enter the names:");
	
	for(int index=0;index<num;index++)
	{
	names[index]=scan.next()+scan.nextLine();
	}
        
	
	if(names[0].equals(names[1]))
	System.out.println("names are equal");
	else
	System.out.println("names are not equal");
	
	if(names[0].equalsIgnoreCase(names[1]))
	System.out.println("names are equal");
	else
	System.out.println("names are not equal");
   }
} 