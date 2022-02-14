/** IMPORTANT NOTES

 * INTRO
 * Java source code end with .java
 * You don't type .class extension when using the java command
 * Always use comments to describe your code and its function
 * 'public' is a Java keyword, and it must be written in lowercase letters.
 * It's knows as an access specifier, and it controls where the class may be accessed from.
 * The 'public' specifier means access to the class is unrestricted. (open to public)
 * 'class' is another keyword and must be written in lowercase as well.
 * You can create many classes in a java file; however, you can have only one 'public class' per file
 * 'HelloWorld' is the name of the class, made up by the programmer.
 * Having a capitalized first letter of each class name is a standard practise (HelloWorld)
 * The name of the public class must be the same as the name of the file (without .java extension)
 * Java is a case-sensitive language. Public and public are not the same.
 * Every Java application program must have a method named "main"
 * Every opening brace must have a closing brace
 *
 * KEYWORDS
 * abstract * assert * boolean * break * byte * case * catch * char * class
 * const * continue * default * do * double * else * enum * extends * false
 * final * finally * float * for * goto * if * implements * import * instanceof
 * int *  interface * long * native * new * null * package * private * protected
 * public * return * short * static * strictfp * super * switch * synchronized
 * this * throw * throws * transient * true * try * void * volatile * while
 *
 * SYNTAX
 * // - comment line
 * () - opening and closing parenthesis, used in method header
 * {} - left & right brace, opening & closing brace, encloses statements, such as the contents of a class or method
 * '' or "" - quotation marks, encloses a string of characters, such as a message to print on the screen
 * ; - semicolon, marks the end of a complete programming statement
 * Comments, class headers and method headers do not end with a semicolon
 *
 * Relationship among the 'system' class, the 'out' object, and the 'print' methods
 * The 'system' class is a part of the JAVA API. It has many objects and methods
 * The 'out' object is a member of the System class, provides methods to send outputs to the screen
 * The 'print' and 'println' methods are members of the out object. They perform the printing work
 * They are all connected each other with a dot (.) [System.out.println]
 *
 * COMMON ESCAPE SEQUENCES
 * \n - newline
 * \t - horizontal tab
 * \b - backspace (moves the cursor one left / deletes one character from the left)
 * \r - return (moves the cursor to the beginning of the line)
 * \\ - prints a backslash
 * \' - prints a single quotation mark
 * \" - prints a double quotation mark
 *
 */
public class HelloWorld {

    public static void main(String[] args) {

        // a single line comment
        System.out.print("Hello ");
		System.out.print("World! \n");
		System.out.println("Hello World!");
        System.out.println("\tHello World!");
        System.out.println("Hello World!\b");
        System.out.println("Hello World!\r");
        System.out.println("----------------");

        //Be Careful with Quotation Marks
        System.out.println("This is 'an' example of usage");
        System.out.println("This is \"an\" example of usage");
        //System.out.println('Or here is "another" one'); //does not work in Java
        //int number = "5" // not correct

        //You can combine multiple items with + operator
        System.out.println("Check " + "this " + "out!");
        System.out.println("Give us a high " + 5);
    }

}