/**
 * ARITHMETIC OPERATORS
 * + Addition
 * - Subtaction
 * * Multiplication
 * / Division
 * % Modulus
 *
 * OPERATOR PRECEDENCE
 * Parantheses
 * - (unary negation)
 * * / % (multiply, divide, modulus)
 * + - (addition, substraction)
 *
 * 4 + 17 % 2 - 1 = 4
 * (6 - 3) + (7 % 2) * 3 = 6
 *
 * COMBINED ASSIGNMENT OPERATORS
 * x = x + 1;
 * balance = balance + deposit;
 * balance = balance - withdrawal
 *
 * += --> q += 3; --> q = q + 3;
 * -= --> a -= 7; --> a = a - 7;
 * *= --> z *= 5; --> z = z * 5;
 * /= --> x /= y; --> a = x / y;
 * %= --> m %= 4; --> m = m % 4;
 *
 * balance += deposit;
 * balance -= withdrawal;
 *
 * OTHER MIXED MATH EXPRESSIONS
 * double / int = double (int will be converted to double first)
 * short * float = float (short will be converted to float first)
 * long - short = long (short will be converted to long first)
 *
 * CREATING NAME CONSTANTS WITH final
 * the value of a final variable cannot change during the execution of the program.
 * it's common to write variable name all UPPERCASE
 * final double INTEREST_RATE = 0.19;
 * amount = balance * INTEREST_RATE;
 *
 */
public class ArithmeticOperators {
    public static void main(String[] args) {

        double regularWages;
        double basePay = 25;
        double regularHours = 40;
        double overtimeWages;
        double overtimePay = basePay * 1.5;
        double overtimeHours = 10;
        double totalWages;

        regularWages = basePay * regularHours;
        overtimeWages = overtimePay * overtimeHours;
        totalWages = regularWages + overtimeWages;
        System.out.println("Wages for this week are $" + totalWages);
        System.out.println("----------------------");

        //power of number abd square root with Math Class (pow and sqrt methods)
        double result = Math.pow(4.0,2.0);
        double x = Math.sqrt(9.0);

        double radius = 12.00;
        double area = Math.PI * Math.sqrt(radius);
        System.out.println(result);
        System.out.println(x);
        System.out.println(area);
        System.out.println("----------------------");

        //to have fractional part of an expression, one of the operands has to double
        int sales = 10, people = 4;
        double salesPerPerson, salesPerPerson1, salesPerPerson2, salesPerPerson3;
        salesPerPerson = sales / people;
        salesPerPerson1 = sales / (double) people;
        salesPerPerson2 = (double) sales / people;
        salesPerPerson3 = (double) (sales / people);
        System.out.println(salesPerPerson);
        System.out.println(salesPerPerson1);
        System.out.println(salesPerPerson2);
        System.out.println(salesPerPerson3);
        System.out.println("---------------");

        final double PRICE;
        PRICE = 19.99;
        System.out.println(PRICE);
        //PRICE = 12.99; // error





    }
}