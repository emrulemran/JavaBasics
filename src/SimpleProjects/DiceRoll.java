  package simpleprojects;

import java.util.Random;

public class DiceRoll {

	public static void main(String[] args) {

		Random rand = new Random();
		int randNum = rand.nextInt(6) + 1;   // to exclude 0

		System.out.println("The random number seen on the top of the dice is: " + randNum);

	}

}
