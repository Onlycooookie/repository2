import java.util.Scanner;

public class ComputeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Enter an amount in double,for example 11.56: ");
		double amount =input.nextDouble();
		
		int remainingAmount=(int)(amount*100);
		
		int numberOFOneDollars=remainingAmount/100;
		remainingAmount=remainingAmount%100;
		
		int numberOFQuarters=remainingAmount/25;
		remainingAmount=remainingAmount%25;
		
		int numberOFDimes=remainingAmount/10;
		remainingAmount=remainingAmount%10;
		
		int numberOFNickels=remainingAmount/5;
		remainingAmount=remainingAmount%5;
		
		int numberPennies=remainingAmount;
		
		System.out.println("Your amount "+amount+" consists of");
		System.out.println(" "+numberOFOneDollars+" dollars");
		System.out.println(" "+numberOFQuarters+" quarters");
		System.out.println(" "+numberOFDimes+" dimes");
		System.out.println(" "+numberOFNickels+" niclels");
		System.out.println(" "+numberPennies+" pennies");
	}

}
