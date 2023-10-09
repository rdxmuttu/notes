import java.util.Scanner;

class PhoneNumberValidator{
   
   public String getInput() {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the Phone Number");
      String PhNo = scan.nextLine();
      return PhNo;
   }
   
   public boolean validatePhoneNumber(String PhNo) {
        boolean bool;
        String regex = "^[0-9]{10}-\\$";



        if (PhNo.matches(regex) )
            bool = true;
        else
            bool = false;
        return bool;   
   }
   
   public void displayResult(String result) {
       System.out.println(result);
   }
}

class Phone {
   public static void main (String[] args) {
      PhoneNumberValidator valid = new PhoneNumberValidator();
      String PhNo = valid.getInput();
      boolean isValid = valid.validatePhoneNumber(PhNo);
      valid.displayResult(isValid ? "Valid" : "Invalid or empty string");
   }
}
 

/*for(int i=0;i<PhNo.length();i++) {
PhNo.char.At(i)=="-";}*/