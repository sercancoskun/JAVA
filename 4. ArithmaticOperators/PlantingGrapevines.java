import java.util.Scanner;

public class PlantingGrapevines{

	public static void main (String[] args){
		
		double lenghtInFeet; // The lenght of the row, in feet
		double endPostSpace; // The amount of space used by an end-post assembly, in feet
		double spaceBetweenVines; // The amount of space between the vines, in feet

		Scanner keyboard = new Scanner (System.in);
		//Get the lenght of the row, in feet
		System.out.print("What's the lenght of the row, in feet? : ");
		lenghtInFeet = keyboard.nextDouble();

		System.out.print("What's the amount of space used by an end-post assembly, in feet? : ");
		endPostSpace = keyboard.nextDouble();

		System.out.print("What's the amount of space between the vines, in feet? : ");
		spaceBetweenVines = keyboard.nextDouble();

		double vinesPerRow = (lenghtInFeet - 2 * endPostSpace) / spaceBetweenVines;

		//The number of grapewines that will fit in a row
		System.out.println("You can plant " + vinesPerRow + " grapevines that will fit in " + lenghtInFeet + " feet");

	}
}
