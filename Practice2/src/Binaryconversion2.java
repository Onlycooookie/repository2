import java.util.Scanner;
public class Binaryconversion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个十进制数: ");
		int n=input.nextInt();
		
		int t=0;//记录位数
		int r=0;
		double result=0;
		while (n>0) {
			r=n%8;
			n=n/8;
			result=result+r*Math.pow(10,t);
			t++;
		}
		System.out.println("转换为八进制数为："+"("+(int)(result)+")"+8);
	}

}
