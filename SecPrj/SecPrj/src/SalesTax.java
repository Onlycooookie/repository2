import java.util.Scanner;

public class SalesTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Enter purchase amount: ");
		double purchaseAmount=input.nextDouble();
		
		double tax=purchaseAmount*0.06;
		System.out.print("Sales tax is $"+(int)(tax*100)/100.0);
		
	}

}
