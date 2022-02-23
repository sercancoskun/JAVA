import java.util.Scanner;

public class CorrectedInputProblem {

    public static void main(String[] args){

        String name;
        int age;
        double income;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your age? ");
        age = keyboard.nextInt();

        System.out.println("What is your annual income? ");
        income = keyboard.nextDouble();

        //consume the remaining line
        //without this line program does not work properly
        keyboard.nextLine();

        System.out.println("What is your name? ");
        name = keyboard.nextLine();

        System.out.println("Hello, " + name + ". Your age is " + age + " and your income is $" + income);

    }

}