public class BracesError{
    public static void main(String[] args){

        int sales = 48000;
        int bonus = 0;
        int daysOff = 0;
        double commissionRate = 0.05;

        //code block inside if statement should be in its braces
        //if not, only the first line will be conditionally executed
        //other lines are always executed.
        if (sales > 50000) //{
            bonus = 500;
            commissionRate = 0.12;
            daysOff += 3;
        //}

        System.out.println("You made $" + sales + " this year");
        System.out.println("Your bonus is $" + bonus);
        System.out.println("Your commission rate is " + commissionRate);
        System.out.println("Total off days: " + daysOff);

    }
}