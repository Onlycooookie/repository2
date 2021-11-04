import java.util.Scanner;
public class Compareloan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Loan amount: ");
		int loanAmount=input.nextInt();
		System.out.print("Number of Years: ");
		int numberOfYears=input.nextInt();
		
		System.out.print("Interest Rate     Monthly Payment     Total Payment");
		System.out.print("\n");
		
		double monthlyInterestRate=1/8;
		double monthlyRate=0;
		double monthlyPayment=0;
		double totalPayment=0;

		for (double i=5.00;i<8.00;i+=monthlyInterestRate) {
			monthlyRate=i/100/12;
			monthlyPayment=loanAmount*monthlyRate/(1-1/Math.pow((1+monthlyRate), numberOfYears*12));
			totalPayment=monthlyPayment*numberOfYears*12;
			System.out.print(i+"%");
			System.out.print("          ");
			System.out.printf("%.2f",monthlyPayment);
			System.out.print("          ");
			System.out.printf("%.2f",totalPayment);
		}
	}
}
