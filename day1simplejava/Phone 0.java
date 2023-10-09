import java.util.Scanner;
class Phone{
  
   
   public String getInput(){
	Scanner scan = new Scanner(System.in);
      System.out.println("Enter the Phone Number");
	String PhNo=scan.nextLine();
	return PhNo;
   }
   public boolean validatePhoneNumber(String PhNo){
        String regex = "^[0-9]{10}[-]?$";
        if(PhNo.matches(regex))
	boolean bool=true;
	else
	boolean bool=false;
	//for(i=0;i<PhNo.length();i++)
	//PhNo.char.At(i)=
	return bool;   
   }
   public void displayResult(String a){
     a=bool? "Valid ":"Invalid or empty string ";
	System.out.println(a);
   }
}
class PhoneNumberValidator{
   public static void main(String[] args) {
	Phone valid = new Phone();
      valid.getInput();
	valid.validatePhoneNumber(PhNo);
	valid.displayResult(a);
 }
}  

 