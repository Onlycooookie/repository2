import java.util.Scanner;
public class Loantimetable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Loan Amount: ");
		double loanAmount=input.nextDouble();
		System.out.print("Number of Years: ");
		int numberOfYears=input.nextInt();
		System.out.print("Annual Interest rate: ");
		double monthlyInterestRate=input.nextDouble();
		
		System.out.print("\n");
		
		double monthlyPayment=0;
		double monthlyRate=0;
		double totalPayment=0;
		double interest=0;
		double pricipal=0;
		double balance=loanAmount;
		
		monthlyRate=monthlyInterestRate/100/12;
		monthlyPayment=loanAmount*monthlyRate/(1-1/Math.pow((1+monthlyRate), numberOfYears*12));
		totalPayment=monthlyPayment*12*numberOfYears;
		
		System.out.printf("Momthly Payment: "+"%.2f",monthlyPayment);
		System.out.print("\n");
		System.out.printf("Total Payment: "+"%.2f",totalPayment);
		System.out.print("\n");
		System.out.print("\n");
		System.out.println("Payment#      Interest      Pricipal      Balance");
		
		for (int i=1;i<=numberOfYears*12;i++) {
			interest=monthlyRate*balance;
			pricipal=monthlyPayment-interest;
			balance=balance-pricipal;
			if (i<10)
				System.out.print(i+"             ");
			else
				System.out.print(i+"            ");
			System.out.printf("%5.2f"+"         "+"%6.2f"+"        "+"%7.2f",interest,pricipal,balance);
			System.out.print("\n");
		}
	}
}
