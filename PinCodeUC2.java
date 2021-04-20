import java.util.regex.*;

public class PinCodeUC2{
 public static void main(String args[]){

 Pattern p = Pattern.compile("^[^a-z A-Z!@#$%^&*]{1}[0-9]{5}$");
 Matcher m = p.matcher("400088");
 Matcher n = p.matcher("A400088");
 Matcher o = p.matcher("@78899");

 boolean b = m.matches();
 boolean c = n.matches();
 boolean d = o.matches();

 System.out.println(b +" "+c +" "+d);
 }
}

