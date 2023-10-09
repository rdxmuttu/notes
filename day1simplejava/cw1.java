import java.util.Scanner;
class cw1{
       public static void main(String [] args)
       {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number of elements:");
	int num=scan.nextInt();
	int[] salesDepartmentEmpIds = new int[num];
        System.out.println("Enter the numbers:");
	for(int index=0;index<num;index++)
	salesDepartmentEmpIds[index]=scan.nextInt();
	
        int count=1;
        for(int i=0;i<num;i++)
	{
	for(int j=i+1;j<num;j++)
	{
	if(salesDepartmentEmpIds[i] == salesDepartmentEmpIds[j])
	count=0;
	}
	
	}
	if (count==1)
	System.out.println("true");
	else
	System.out.println("false");


	
	
       
	
   }
} 