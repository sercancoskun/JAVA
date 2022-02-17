/**
 *
 * DATA TYPE CONVERSION
 * Java is a strongly typed language.
 * Java checks data types of variables and determines whether they are compatible.
 *
 * int x;
 * double y = 2.50;
 * x = y ;
 * // possible loss of precision
 *
 * int x;
 * short y = 2;
 * x = y;
 * // OK (int data type outranks a short)
 *
 * double x;
 * int y = 10;
 * x = y;
 * // Performs widening conversion
 * // It means lower ranked int value is stored in higher ranked double
 * // A narrowing conversion is conversion of a value to a lower ranked type. (from double to int)
 * // It can cause a data loss, so Java does not automatically perform them.
 *
 * PRIMITIVE DATA TYPE RANKING
 * double --> The Highest Rank
 * float
 * long
 * iny
 * short
 * byte --> The Lowest Rank
 *
 * CAST OPERATORS
 * littleNum = (short) bigNum;
 * x = (long) 3.7;
 * number = (int) 72.567;
 * value = (float) x;
 * value = (byte) number;
 * OR
 * salesPerPerson = sales / (double) people
 * salesPerPerson = (double) sales / people
 *
 *
 */
class DataTypes {

    public static void main(String[] args) {

        boolean result = true;
        char capitalC = 'C';
        byte b = 100;
        short s = 10000;
        int i = 100000;
        double d = 9.99;
        //float f = 23.5; //error, it's double
        float f = 23.5678901234f;
        //double salary = $1,257.00; // error
        double salary = 1257.00;

        System.out.println(result);
        System.out.println(capitalC);
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(d);
        System.out.println(f);
        System.out.println(salary);
        System.out.println("---------------");

        // The number 26, in decimal
        int decVal = 26;
        //  The number 26, in hexadecimal
        int hexVal = 0x1a;
        // The number 26, in binary
        int binVal = 0b11010;

        System.out.println(decVal);
        System.out.println(hexVal);
        System.out.println(binVal);
        System.out.println("---------------");

        double d1 = 123.4;
        // same value as d1, but in scientific notation
        double d2 = 1.234e2;
        float f1  = 123.4f;

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(f1);
        System.out.println("---------------");

        //In Java SE 7 and later, any number of underscore characters (_)
        //can appear anywhere between digits in a numerical literal.
        //This feature enables you, for example. to separate groups of digits in numeric literals,
        //which can improve the readability of your code.
        long creditCardNumber = 1234_5678_9012_3456L;
        long socialSecurityNumber = 999_99_9999L;
        float pi =  3.14_15F;
        long hexBytes = 0xFF_EC_DE_5E;
        long hexWords = 0xCAFE_BABE;
        long maxLong = 0x7fff_ffff_ffff_ffffL;
        byte nybbles = 0b0010_0101;
        long bytes = 0b11010010_01101001_10010100_10010010;

        System.out.println(creditCardNumber);
        System.out.println(socialSecurityNumber);
        System.out.println(pi);
        System.out.println(hexBytes);
        System.out.println(hexWords);
        System.out.println(maxLong);
        System.out.println(nybbles);
        System.out.println(bytes);
        System.out.println("---------------");

        //IN INTEGER DIVISIONS, THE RESULT COMES INTEGER!!
        double number;
        number = 5 / 2;
        System.out.println(number);

        double number2;
        number2 = 5.0 / 2;
        System.out.println(number2);
        System.out.println("----------------------");


    }

}