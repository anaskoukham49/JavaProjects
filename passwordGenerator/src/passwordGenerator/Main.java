package passwordGenerator;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String specialCharacters = "!@#$%&*()_+-=[]|,./?><";
		String alphabetLower = "abcdefghijklmnopqrstuvwxyz";
		String alphabetUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String digits = "0123456789";
		
		int passLength = 0;
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.print("Enter password length : ");
		passLength = sc.nextInt();
		if(passLength >=4) {
			break;
		}
		System.out.print("Password should contain at least 4 characters");
		}
		
		Random generator = new Random();
		
		String allChar = specialCharacters + alphabetLower + alphabetUpper + digits;
		
		boolean validPassword = false;
		
		
		while(!validPassword) {
			StringBuilder password = new StringBuilder();
			boolean hasLower = false;
			boolean hasUpper = false;
			boolean hasDigit = false;
			boolean hasSpecial = false;
			
			for(int i =0;i < passLength;i++) {
				
				int randomIndex = generator.nextInt(allChar.length());
				char randomChar = allChar.charAt(randomIndex);
				password.append(randomChar);
				
				if(Character.isLowerCase(randomChar)) {
					hasLower = true;
				}
				if(Character.isUpperCase(randomChar)) {
					hasUpper = true;
				}
				if(Character.isDigit(randomChar)) {
					hasDigit = true;
				}
				if(specialCharacters.indexOf(randomChar) >= 0) {
					hasSpecial = true;
				}
			}
			
			if(hasLower && hasUpper && hasDigit && hasSpecial) {
				validPassword = true;
				System.out.print("Generated Password : " + password.toString());
			}
		}
	}

}
