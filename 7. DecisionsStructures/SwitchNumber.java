import java.util.Scanner;
public class SwitchNumber{

    public static void main(String args[]){

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please type a number from the list (1-4): ");
		int number = keyboard.nextInt();

		switch(number){
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			case 4:
				System.out.println("4");
				break;
			default:
			System.out.println("Please use only 1,2,3 or 4!");

		}
    }
}