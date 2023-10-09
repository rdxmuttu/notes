import java.util.Scanner;
class cw2{
       public static void main(String [] args)
       {
	
	Scanner scan = new Scanner(System.in);
	int l=0,m=0;
	System.out.println("Enter the number of elements:");
	int num=scan.nextInt();
	String []names = new String[num];
        System.out.println("Enter the names:");
	
	for(int index=0;index<num;index++)
	{
	names[index]=scan.next()+scan.nextLine();
	}
        for(int i=0;i<num;i++)
{
	 for(int j=i+1;j<num;j++)
	{
	l=names[i].length();
	if(names[i].length()>names[j].length())
	l= names[j].length();
	}
}
 for(int i=0;i<num;i++){
	m=names[i].length();
     if(l==m)
	System.out.println("Shortest word is "+names[i]); }
   }
} 