package validatePassword;

import java.util.Scanner;
import java.util.regex.Pattern;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// keep this function call here     
	    Scanner s = new Scanner(System.in);
	    //System.out.print(StringChallenge(s.nextLine())); 
	    String password = s.nextLine();

	    //REGEX sin dejar escapar caracteres especiales
	    //String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+\\-=[\\]{};':\"\\\\|,.<>/?`~])(?!.{0,30}password).{8,30}$";
	    
	    //Aqui otro regex con problemas en password
	    //String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?`~])(?!.{0,30}password).{8,30}$";
	    
	    //dejando escapar los caracteres especiales
	    String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?`~])(?!.*(?i)password).{8,30}$";
	    
	    
	    

	    if(Pattern.matches(regex, password)){
	      System.out.println(true);
	    }else{
	      System.out.println(false);
	    }
	}

}
