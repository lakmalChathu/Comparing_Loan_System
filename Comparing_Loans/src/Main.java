import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		double amount=0;
		int years=0;
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Loan Amount : ");
			amount = input.nextDouble();
			System.out.println();
			System.out.print("Number of Years : ");
			years = input.nextInt();
			System.out.println();
		}catch(Exception e) {
			System.out.println("Ënter amount and year clearly!");
			System.exit(0);
		}
		
		Loan loan = new Loan(amount,years);
		print(loan);
	}
	
	public static void print(Loan loan) {
		ArrayList<String> details = loan.displayPayment();
		System.out.println("Interest Rate"+"\t\t"+"Monthly Payment"+"\t\t\t"+"Total Payment");
		System.out.println("---------------------------------------------------------------------");
		for(String entry : details) {
			System.out.println(entry);
			System.out.println("---------------------------------------------------------------------");
		}
	}
}
