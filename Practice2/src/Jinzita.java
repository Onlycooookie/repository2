import java.util.Scanner;
public class Jinzita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int num=input.nextInt();
		for (int m=1;m<=num;m++) {
			for (int i=1;i<=num-m;i++)
				System.out.print("  ");
			for (int j=m;j>=1;j--)
				System.out.print(j+" ");
			for (int k=2;k<=m;k++)
				System.out.print(k+" ");
			System.out.print("\n");
		}
	}
}
