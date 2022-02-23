import java.util.Scanner;

/**
 *
 * @author oflores
 */
public class ThreeValuesRead {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product code: ");
        String productCode = sc.nextLine();

        System.out.print("Enter Price:  ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity:  ");
        int quantity = sc.nextInt();

        double total = price * quantity;
        System.out.println();
        System.out.println(quantity + " "+ productCode + " @ " + price + " = " + total);
        System.out.println();



    }

}