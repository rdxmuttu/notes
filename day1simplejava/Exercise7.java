import java.util.Scanner;
class Exercise7{
       public static void main(String [] args)
       {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter length of side m:"); 
        float distance_km=scan.nextFloat();
	System.out.println("Enter Speed in km/hr:"); 
        float speed_kmph=scan.nextFloat();
	float time_hr=distance_km/speed_kmph;
	System.out.println("Time taken for journey is "+ time_hr);
       }
} 