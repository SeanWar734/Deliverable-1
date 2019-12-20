package mypackage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		String vacationType;
		String suggestedVacation = null;
		int groupSize;
		String suggestedTravel;
		
		System.out.println("What kind of trip would you like to go on, musical, tropical, or adventurous?");
		vacationType = scnr.nextLine();		
		
		System.out.println("How many are in your group?");
		groupSize = scnr.nextInt();
		
		if (vacationType.equals("musical")) {
			suggestedVacation = "New Orleans";
		}
		else if (vacationType.equals("tropical")) {
			suggestedVacation = "a beach vacation in Mexico";
		}
		else if (vacationType.equals("adventurous")) {
			suggestedVacation = "go whitewater rafting at the Grand Canyon";
		}
		
		if (groupSize <= 2) {
			suggestedTravel = "first class flight";
		}
		else if(groupSize > 2 && groupSize <= 5) {
			suggestedTravel = "helicopter";
		}
		else {
			suggestedTravel = "charter flight";
		}
		
		
		if (groupSize > 1) {
			System.out.println("Since you're a group of " + groupSize + " going on a " + vacationType + " vacation, you should take a " + suggestedTravel + " to " + suggestedVacation + ".");
		}
		else if (groupSize == 1) {
			System.out.println("Since you're traveling alone going on a " + vacationType + " vacation, you should take a " + suggestedTravel + " to " + suggestedVacation + ".");
		}

	}

}
