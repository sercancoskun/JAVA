/**
 *
 * IDENTIFIERS
 * Programmer defined names that represent some element of a program.
 * variable names are class names are examples of identifiers
 * The first character must be: A-Z, a-z, underscore(_) or dollar sign($)
 * After the first character, you can use: A-Z, a-z, 0-9, underscore(_) or dollar sign($)
 * Case sensitive: totalOf and totalof are different variable names
 * Identifiers cannot include space
 *
 * variableName - OK
 * 2dDesign - NOT
 * may1996 - OK
 * space#3 - NOT
 * total num - NOT
 *
 * LITERALS
 * The value that is written in the code of a program.
 * They are commonly assigned to variables or displayed.
 * 20 or "Hello World!" are literals assigned to a variable.
 *
 * CLASS NAMES vs VARIABLE NAMES
 * It's a standard practise to begin:
 * variable names with lowercase letters (numOfStudents)
 * class names with uppercase letters (Variables)
 * then first letter of each subsequent word.
 *
 * SCOPE
 * Every variable has a scope.
 * The scope of a variable is the part of program where the variable may be accessed by its name
 * Variables that are declared inside a method are called local variables
 * Local variables cannot be accessed by code that is outside the method
 * Calling a variable before declaring it give us an error
 * You cannot have two local variables with the same name in the same scope
 *
 */
public class Variables {

    public static void main(String[] args) {

        int numOfStudents = 20;
        //int numOfTeachers = "4"; // does not work

        System.out.println("Number of Students :" + numOfStudents);

    }

}