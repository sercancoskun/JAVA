public class StockTransactionProgram{

	public static void main (String[] args){
		
		int numOfShares = 1000;
		double costPerShare = 32.87;
		double commission = 0.02;

		int numOfSharesSold = 1000;
		double pricePerShare = 33.92;

		double paidForStock = numOfShares * costPerShare;
		double purchaseCommission = (numOfShares * costPerShare) * commission;
		double balance = paidForStock - purchaseCommission;
		double soldStockAmount = numOfSharesSold * pricePerShare;
		double sellCommission = soldStockAmount * commission;
		double profit = soldStockAmount - paidForStock - purchaseCommission - sellCommission;

		System.out.println("The amount of money Joe paid for the stock: $" + paidForStock);
		System.out.println("The amount of commission Joe paid his broker when he bought the stock: $" + purchaseCommission);
		System.out.println("The amount that Joe sold the stock for: $" + soldStockAmount);
		System.out.println("The amount of profit Joe made after selling his stock and paying two commissions to his broker: $" + profit);

	}
}
