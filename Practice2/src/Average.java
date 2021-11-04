import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		double num[]=new double[10];
		double sum=0;
		double t=0;
		double s=0;
		for (int i=0;i<10;i++) {
			num[i]=input.nextDouble();
			sum+=num[i];
			t+=num[i]*num[i];
		}
		System.out.print("\n");
		System.out.printf("The mean is: "+"%.2f",sum/10);
		s=Math.sqrt((t-(sum*sum)/10)/9);
		System.out.print("\n");
		System.out.printf("The stardard deviation is: "+"%.5f",s);
	}
}
