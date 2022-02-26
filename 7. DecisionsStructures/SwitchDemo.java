import java.util.Scanner;
public class SwitchDemo{

    public static void main(String args[]){

	Scanner keyboard = new Scanner(System.in);
	System.out.println("Please type your grade (A-F) to see if you have passed:  ");
    char grade = keyboard.next().charAt(0);
	char gradeUpper = Character.toUpperCase(grade);
	
	switch(gradeUpper){
		
		case('A'):
			System.out.println("Perfect : You passed!");
			break;
		case('B'):
			System.out.println("Vey good: You passed!");
			break;
		case('C'):
		case('D'):
			System.out.println("Good: You passed!");
			break;
		case('F'):
			System.out.println("You failed!");
			break;
		default:
		System.out.println("Invalid grade!");
		
		
	}
        
    }
}



