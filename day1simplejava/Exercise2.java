import java.util.Scanner;
class Exercise2{
       public static void main(String [] args)
       {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Distance in km:"); 
        float distance_km=scan.nextFloat();
	float distance_m=distance_km*1000;
	System.out.println("Distance in meter is "+ distance_m);
       }
} 