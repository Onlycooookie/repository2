import java.util.Scanner;
public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Enter 10 numbers:");
		double a[]=new double[11];
		for (int i=0;i<10;i++) {
			a[i]=input.nextDouble();
		}
		for (int i=0;i<9;i++) {
			for (int j=0;j<9-i;j++) {
				if (a[j]>a[j+1]) {
					double tmp=a[j];
					a[j]=a[j+1];
					a[j+1]=tmp;
				}
			}
		}
		for (int i=0;i<10;i++) {
			System.out.println(a[i]);
		}
	}
}
