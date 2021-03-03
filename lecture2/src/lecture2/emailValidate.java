package lecture2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class emailValidate {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter your email");
		String email = sn.next();
		System.out.println("Entered email id : " + email);

		boolean result = isValidEmail(email);
		if (result) {
			System.out.println(email + " is valid email address.");
		} else {
			System.out.println(email + " is not a valid email address.");
		}
 
	}
	public static boolean isValidEmail(String email) {
		String s = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
		Pattern patt = Pattern.compile(s);
		Matcher mat = patt.matcher(email);
		return mat.matches();
	}
}
 