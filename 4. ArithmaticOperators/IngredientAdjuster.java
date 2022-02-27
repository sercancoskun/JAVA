import java.util.Scanner;

public class IngredientAdjuster{

	public static void main (String[] args){
		
		double sugarNeeded = 1.5 / 48; // Cups of sugar needed to make 48 cookies
		double butterNeeded = 1.0 / 48; // Cups of butter needed to make 48 cookies
		double flourNeeded = 2.75 / 48; // Cups of flour needed to make 48 cookies
		
		// Create a Scanner object for keyboard input
		Scanner keyboard = new Scanner (System.in);
		//Get the number of cookies wanted to made
		System.out.print("How many cookies do you want to make? : ");
		double cookie = keyboard.nextDouble();
		
		//Give the ingredient
		System.out.println("You need: ");
		System.out.println(cookie * sugarNeeded + " cups of sugar");
		System.out.println(cookie * butterNeeded + " cups of butter");
		System.out.println(cookie * flourNeeded + " cups of flour");

	}
}
