import java.util.Scanner;
public class Printdiffentnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Enter 10 numbers:");
		int a[]=new int[10];
		int b[]=new int[10];
		int total=10;
		int m=0;
		for (int i=0;i<10;i++) {
			int flag=0;
			a[i]=input.nextInt();
			for (int j=0;j<i;j++) {
				if (a[i]==a[j]) {
				    flag=1;
				    total--;
				    break;
				}
			}
			if (flag==0) {
				b[m]=a[i];
				m++;
		    }
		}
		System.out.println("The number of distinct number is: "+total);
		System.out.print("The distinct numbers are: ");
		for (int i=0;i<total;i++) 
			System.out.print(b[i]+" ");
	}
}
