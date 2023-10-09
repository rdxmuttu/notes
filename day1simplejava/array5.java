import java.util.Scanner;
class array5{
       public static void main(String [] args)
       {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the number of elements:");
	int num=scan.nextInt();
	int [][]nums = new int[num][num];
        System.out.println("Enter the numbers:");
	
	 
	
        for(int i=0;i<num;i++){
	  for(int j=0;j<num;j++)
	nums[i][j]=scan.nextInt();
	 }
	for(int []row : nums){
	 for(int value: row){
	System.out.print(value +"\t");
	}
	System.out.println();
}
   }
} 