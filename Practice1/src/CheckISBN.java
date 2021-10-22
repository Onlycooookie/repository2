import java.util.Scanner;
public class CheckISBN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		
		int number =input.nextInt();
		int t=number;
		int d[]=new int[11];
		int i=9;
		
		while (i>0) {
			d[i]=number%10;
			number/=10;
			i--;
		}
		d[10]=(d[1]+2*d[2]+3*d[3]+4*d[4]+5*d[5]+6*d[6]+7*d[7]+8*d[8]+9*d[9])%11;
		if (d[10]==10 && d[1]!=0)
			System.out.println("The ISBN-10 number is "+t+"X");
		else if (d[1]==0 && d[10]!=10)
			System.out.println("The ISBN-10 number is "+"0"+t+d[10]);
		else if (d[1]==0 && d[10]==10)
			System.out.println("The ISBN-10 number is "+"0"+t+"X");
		else
			System.out.println("The ISBN-10 number is "+t+d[10]);
	}

}
