public class SemicolonError{
    public static void main(String[] args){

        int x = 0, y = 10;

        //DO NOT prematurely terminate an if statement with a semicolon
        //this will not display any error message; however, the condition will have a null statement
        //it will not execute anything
        if (x>y);
            System.out.println(x + " is greater than " + y); //this will always execute

    }
}