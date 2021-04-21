import java.util.regex.*;

public class PinCodeTakingArgs {

  public static boolean isvalid(String pincode) {

      String pattern="^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";

  	Pattern P=Pattern.compile(pattern);
  	 if(pincode == null) {
   	  return false;
         }

 	Matcher m = P.matcher(pincode);
  	 return m.matches();
  }

  public static void main(String[] args) {

     String pincode=args [0];
	System.out.println(pincode+":"+ isvalid(pincode));
  }
}
