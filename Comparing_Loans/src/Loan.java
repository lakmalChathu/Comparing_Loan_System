import java.util.ArrayList;

public class Loan {
	private double amount;
	private int years;
	
	public Loan() {
		
	}
	
	public Loan(double amount,int years) {
		this.amount = amount;
		this.years = years;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public void setYears(int years) {
		this.years = years;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public int getYears() {
		return years;
	}
	
	public ArrayList<String> displayPayment() {
		ArrayList<String> details = new ArrayList<String>();
		double monthlyPayment=0;
		double totalPayment=0;
		
		for(double i=5;i<=8;i+=0.125) {
			monthlyPayment = ((amount*i)*Math.pow((1+i), 12*years))/(Math.pow((1+i), 12*years)-1);
			totalPayment = monthlyPayment*12*years;
			details.add(i+"%\t\t\t$"+String.format("%.2f", monthlyPayment)+"\t\t\t$"+String.format("%.2f",totalPayment));
		}
		
		return details;
	}
}
