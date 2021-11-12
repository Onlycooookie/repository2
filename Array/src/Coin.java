import java.util.Scanner;
public class Coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number between 0 and 511:");
		int n=input.nextInt();
		int[] a=new int[9];
		int[][] b=new int[3][3];
		
		int i=0;
		//十进制转二进制
		while (n>0) {
			a[i]=n % 2;
			n=n/2;
			i++;
		}
		b[0][0]=a[8];b[0][1]=a[7];b[0][2]=a[6];
		b[1][0]=a[5];b[1][1]=a[4];b[1][2]=a[3];
		b[2][0]=a[2];b[2][1]=a[1];b[2][2]=a[0];
		for (i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if (b[i][j]==0) {
					System.out.print("H ");
				}
				else {
					System.out.print("T ");
				}
			}
			System.out.print("\n");
		}
	}

}
