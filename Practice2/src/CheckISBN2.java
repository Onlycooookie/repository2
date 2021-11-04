import java.util.Scanner;
public class CheckISBN2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		
		int number =input.nextInt();
		int t=number;
		int d[]=new int[11];
		
		for (int i=9;i>0;i--) {
			d[i]=number%10;
			d[10]+=i*d[i];
			number/=10;
		}
		
		d[10]=d[10]%11;
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
