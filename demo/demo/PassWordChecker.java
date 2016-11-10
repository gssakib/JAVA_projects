package demo;
import java.util.Scanner;
public class PassWordChecker {

	public static void main(String[] args) {
		System.out.println("Enter pass: ");
		Scanner stdin = new Scanner(System.in);
		
		String str = stdin.nextLine();
		PassWordChecker ob = new PassWordChecker();
		System.out.println(ob.checkPass(str));

	}
	
	
	public  String checkPass(String str){
		String pass = str;
		int count = 0;
		if(pass.length() < 8){
			return "invalid password!";
			
		}
		
		for(int i = 0; i< pass.length() ; i++){
			
			if(!(pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z') && !(pass.charAt(i) >= '0' && pass.charAt(i) <= '9')){
				return "invalid password!";
			}else if(!(pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z') && !(pass.charAt(i) >= '0' && pass.charAt(i) <= '9')){
				return "invalid password!";
			}
			if(pass.charAt(i) >= '0' && pass.charAt(i) <= '9'){
				count++;
			}
		}
		if(count >=2){
			return "valid password";
		}else{
			return "invalid password.";
		}
	}

}
