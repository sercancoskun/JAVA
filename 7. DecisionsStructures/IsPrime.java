import java.util.Scanner;

public class IsPrime{

    public static void main(String args[]){
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("This program tells you if a number is a prime number.");
		System.out.println("You can see its dividers as well :)");
		System.out.println("Give me a number: ");

		int number = keyboard.nextInt();

		int numOfDivider = 0;
		
		System.out.println("Dividers: ");
		
		for(int i=1;i<=number;i++){
		
			if(number % i == 0){
				System.out.println(i);
				numOfDivider += 1;
				
			}
			
		}
		
		System.out.println("-----------------");
		
		if(numOfDivider == 2){
			System.out.println(number + " is a prime number.");
		}else {
			System.out.println(number + " is not a prime number.");
		}

    }
	
}



