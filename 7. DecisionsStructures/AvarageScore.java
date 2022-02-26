import java.util.Scanner;

public class AvarageScore {
    public static void main(String[] args){

        double score1, score2, score3, average;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter score #1: ");
        score1 = keyboard.nextDouble();

        System.out.println("Enter score #2: ");
        score2 = keyboard.nextDouble();

        System.out.println("Enter score #3: ");
        score3 = keyboard.nextDouble();

        System.out.println("The first score entered was: " + score1);
        System.out.println("The second score entered was: " + score2);
        System.out.println("The third score entered was: " + score3);

        average = (score1 + score2 + score3) / 3.0;
        System.out.println("Your average is " + average);

        if (average > 95){
            System.out.println("That's a great score!");
        }
    }
}