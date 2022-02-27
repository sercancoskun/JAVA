import java.util.Scanner;
import java.lang.Math;

public class CompoundInterest{

	public static void main (String[] args){

		double balance, principal, interestRate;
		int interestTimes, timeInYears;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("The amount of principle originally deposited into the account: ");
		principal = keyboard.nextDouble();

		System.out.print("The annual interest rate paid by the account (in percentage, like 2): ");
		interestRate = keyboard.nextDouble();

		System.out.print("The number of times per year that the interest is compounded (12 for monthly, 4 for quarterly): ");
		interestTimes = keyboard.nextInt();

		System.out.print("The number of years the account will be left to earn interest: ");
		timeInYears = keyboard.nextInt();

		balance = principal * Math.pow(1 + (interestRate / 100) / interestTimes, interestTimes * timeInYears);

		System.out.println("--------------------------");
		System.out.println("The principle: $" + principal);
		System.out.println("The annual interest rate: " + interestRate + "%");
		System.out.println("The interest period (12 for monthly, 4 for quarterly): " + interestTimes);
		System.out.println("The balance after " + timeInYears + " years: $" + Math.round(balance));

	}
}
