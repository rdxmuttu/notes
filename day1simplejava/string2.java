import java.util.Scanner;
class string2{
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
        
	
	int diff = names[0].compareTo(names[1]);
	System.out.println(diff);
   }
} 