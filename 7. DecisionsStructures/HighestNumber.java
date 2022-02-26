import java.util.Scanner;

class HighestNumber{

    public static void main(String args[]){

		Scanner keyboard = new Scanner(System.in);
		System.out.println("This program asks you 3 numbers and tells you the biggest one.");

		System.out.println("Give me the first number: ");
		int number1 = keyboard.nextInt();

		System.out.println("Give me the second number: ");
		int number2 = keyboard.nextInt();

		System.out.println("Give me the third number: ");
		int number3 = keyboard.nextInt();

		System.out.println("----------------------");

		int highest = number1;

		if(highest<number2){

			highest = number2;

		}

		if(highest<number3){

			highest = number3;

		}

		System.out.println(highest + " is the biggest!");
       
    }
}
