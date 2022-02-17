import java.util.Scanner;

public class ReadingKeyboard {

    public static void main(String[] args){

        String name;
        int hours;
        double payRate;
        double grossPay;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What's your name? ");
        name = keyboard.nextLine();

        System.out.println("How many hours did you work last week? ");
        hours = keyboard.nextInt();

        System.out.println("What is your hourly pay rate? ");
        payRate = keyboard.nextDouble();

        grossPay = hours * payRate;

        System.out.println("Hello, " + name);
        System.out.println("Your gross pay is $" + grossPay);



    }

}