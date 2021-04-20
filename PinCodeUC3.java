import java.util.regex.*;

public class PinCodeUC3{
 public static void main(String args[]){

 Pattern p = Pattern.compile("^[1-9]{1}[0-9]{4}[^a-z A-Z!@#$%^&*]{1}$");
 Matcher m = p.matcher("400088");
 Matcher n = p.matcher("400088A");
 Matcher o = p.matcher("@78899");

 boolean b = m.matches();
 boolean c = n.matches();
 boolean d = o.matches();

 System.out.println(b +" "+c +" "+d);
 }
}

