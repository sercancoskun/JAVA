import javax.swing.JOptionPane;

public class PayrollDialog {

    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("What is your name?");

        String hours = JOptionPane.showInputDialog("How many hours did you work last week?");
        int hr = Integer.parseInt(hours);

        String payRate = JOptionPane.showInputDialog("What is your hourly pay rate?");
        double pR = Double.parseDouble(payRate);

        double grossPay = hr * pR;

        JOptionPane.showMessageDialog(null, "Your gross pay is $" + grossPay);

        System.exit(0);

    };

}
