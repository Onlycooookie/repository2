import java.util.Scanner;
public class Binaryconversion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("������һ��ʮ������: ");
		int n=input.nextInt();
		
		int t=0;//��¼λ��
		int r=0;
		double result=0;
		while (n>0) {
			r=n%8;
			n=n/8;
			result=result+r*Math.pow(10,t);
			t++;
		}
		System.out.println("ת��Ϊ�˽�����Ϊ��"+"("+(int)(result)+")"+8);
	}

}
