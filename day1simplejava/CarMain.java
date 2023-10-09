class Car{
   int regNo;
   String model;
   String color;
   public void start(){
      System.out.println("Start the car!!");
   }
   public void brake(){
      System.out.println("Hit the brakes..");   
   }
   public void printCarDetails(){
      System.out.println("Registration Number is: "+regNo);
      System.out.println("Model Name is: "+model);
      System.out.println("Colour is: "+color);
   }
}
class CarMain{
   public static void main(String[] args) {
      Car c1=new Car();
      c1.regNo=133;
      c1.model="2d2e23";
      c1.color="green";
      Car c2=new Car();
      c2.regNo=136;
      c2.model="2d24r3";
      c2.color="white";
      c1.start();
      c1.printCarDetails();
      c1.brake();
      c2.printCarDetails();
 }
}  

 