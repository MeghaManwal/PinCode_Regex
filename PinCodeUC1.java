import java.util.regex.*;

public class PinCodeUC1{
 public static void main(String args[]){

 Pattern p = Pattern.compile("^[1-9]{1}[0-9]{5}$");
 Matcher m = p.matcher("400088");
 Matcher n = p.matcher("011188");
 Matcher o = p.matcher("31118899");

 boolean b = m.matches();
 boolean c = n.matches();
 boolean d = o.matches();

 System.out.println(b +" "+c +" "+d);
 }
}

