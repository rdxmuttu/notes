import java.util.Scanner;
class Program{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name=scan.nextLine();
        System.out.println("Enter your age:");
        int age=scan.nextInt();
        System.out.println("Enter the price:");
        float price=scan.nextFloat();
        System.out.println("Enter the total price:");
        double total=scan.nextDouble();

    }
}