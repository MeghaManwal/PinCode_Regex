import java.util.regex.*;

public class PinCodeUC4 {
 public static void main(String args[]){

 Pattern p = Pattern.compile("^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$");
 Matcher m = p.matcher("400088");
 Matcher n = p.matcher("111 588");
 Matcher o = p.matcher("31118899");

 boolean b = m.matches();
 boolean c = n.matches();
 boolean d = o.matches();

 System.out.println("400088:"+b+" "+"111 588:"+ c +" "+"31118899:"+d);
 }
}
