package Roulete;

/*2- Roulette Wheel ColorsOn a roulette wheel, the pockets are numbered from 0 to 36. The colors of the pockets are as follows:Pocket 0 is green.For pockets 1
through 10, the odd-numbered pockets are red and the even-numbered pockets are black.For pockets 11 through 18, the odd-numbered pockets are black and the 
even-numbered pockets are red.For pockets 19 through 28, the odd-numbered pockets are red and the even-numbered pockets are black.For pockets 29 through 36, 
the odd-numbered pockets are black and the even-numbered pockets are red.

Write a class named RoulettePocket. The class's constructor should accept a pocket number. 
The class should have a method named getPocketColor that returns the pocket's color, as a string.Demonstrate 
the class in a program that asks the user to enter a pocket number, and displays whether the pocket is green, red, or black. 
The program should display an error message if the user enters a number that is outside the range of 0 and 36.*/

public class RoulettePocket {
	
	String color = "";
	
	
	public RoulettePocket(int pocketNumber) {
		String [] colorTeam = {"red", "black", "green"};
		
		if(pocketNumber < 0 || pocketNumber > 36) {
			System.out.println("Wrong pocket number");
		}
		else if( pocketNumber == 0) {
			color = colorTeam[2];
		}
		else if(pocketNumber <= 10) {
			color = colorTeam[pocketNumber % 2 + 1];
		}
		else if(pocketNumber <= 18) {
			color = colorTeam[pocketNumber % 2];
		}
		else if(pocketNumber <= 28) {
			color = colorTeam[pocketNumber % 2 + 1];
		}
		else {
			color = colorTeam[pocketNumber % 2];
		}
		
	}
	
	public String getPocketColor() {
		return color;
	}
}
