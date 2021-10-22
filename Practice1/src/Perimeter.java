import java.util.Scanner;
public class Perimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("请输入三角形的三条边： ");
		
		int n[]=new int[10];
		int sum=0;
		for (int i=0;i<3;i++) {
			n[i]=input.nextInt();
			sum+=n[i];
		}
		
		if (n[0]+n[1]>n[2] && n[0]+n[2]>n[1] && n[1]+n[2]>n[0])
			System.out.println("三角形周长为： "+sum);
		else
			System.out.println("Error!");
	}

}
