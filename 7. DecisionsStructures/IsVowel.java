import java.util.Scanner;

public class IsVowel{

    public static void main(String args[]){

		Scanner keyboard = new Scanner(System.in);
		System.out.println("This program checks if a letter is vowel or consonant.");
		System.out.println("Type a letter: ");
		String letter = keyboard.nextLine();
		
		String vowel = "aeiou";
		String consonant = "bcdfghjklmnpqrstvwxyz";

		if (letter.length() == 1){
			if(vowel.indexOf(letter) >= 0){
				System.out.println(letter + " is a vowel");
			}else if(consonant.indexOf(letter) >= 0){
				System.out.println(letter + " is a consonant");
			}else{
				System.out.println(letter + " is not a letter");
			}
		}else{
			System.out.println(letter + " is not a letter");
		}

    }
}



