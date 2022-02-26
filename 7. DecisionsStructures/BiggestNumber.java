import java.util.Scanner;

class BiggestNumber{

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
		
		if(number1 > number2 && number1 > number3){
			
			System.out.println(number1 + " is the biggest!");
			
		}else if(number2 > number1 && number2 > number3){
			
			
			System.out.println(number2 + " is the biggest!");
			
		}else{
			
			System.out.println(number3 + " is the biggest!");
			
		}
       
    }
}
