package rockpaperscissors;
import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.print("Would you like to play ? (Yes or No) : ");
		String ch = sc.next();
		if(ch.equalsIgnoreCase("no")) {
			System.out.println("Game END!");
			break;
		}
		if(!ch.equalsIgnoreCase("yes")) {
			System.out.println("invalid choice please try again!");
			continue;
		}
			System.out.print("Rock , Paper , Scissors ? : ");
			String choice = sc.next();
			
			
			String[] robotChoices = {"rock","paper","scissors"};
			
			Random generator = new Random();
			int index = generator.nextInt(robotChoices.length);
			
			int robotScore = 0;
			int userScore = 0;
			
			
			if(choice.equalsIgnoreCase("rock") && robotChoices[index].equalsIgnoreCase("rock") || 
					choice.equalsIgnoreCase("paper") && robotChoices[index].equalsIgnoreCase("paper") ||
						choice.equalsIgnoreCase("scissors") && robotChoices[index].equalsIgnoreCase("scissors")) {
							System.out.println("It's a tie !");
			}
			else if(choice.equalsIgnoreCase("rock") && robotChoices[index].equalsIgnoreCase("scissors") || 
					choice.equalsIgnoreCase("paper") && robotChoices[index].equalsIgnoreCase("rock") ||
					choice.equalsIgnoreCase("scissors") && robotChoices[index].equalsIgnoreCase("paper")) {
						System.out.println("You Win!");
						userScore++;
		}
			else if(choice.equalsIgnoreCase("scissors") && robotChoices[index].equalsIgnoreCase("rock") || 
					choice.equalsIgnoreCase("paper") && robotChoices[index].equalsIgnoreCase("scissors") ||
					choice.equalsIgnoreCase("rock") && robotChoices[index].equalsIgnoreCase("paper")) {
						System.out.println("You Lose !");
						robotScore++;
		}
			else {
				System.out.print("Error invalid choice ! please choose again.");
			}
			
			System.out.println("User Score = "+userScore);
			System.out.println("Robot Score = "+robotScore);
		}
		sc.close();

	}
}
