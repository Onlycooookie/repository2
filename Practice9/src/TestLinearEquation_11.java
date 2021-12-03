import java.util.Scanner;
public class TestLinearEquation_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		
		System.out.print("输入a:");
		double a=input.nextDouble();
		System.out.print("输入b:");
		double b=input.nextDouble();
		System.out.print("输入c:");
		double c=input.nextDouble();
		System.out.print("输入d:");
		double d=input.nextDouble();
		System.out.print("输入e:");
		double e=input.nextDouble();
		System.out.print("输入f:");
		double f=input.nextDouble();
		
		LinearEquation_11 exam=new LinearEquation_11(a,b,c,d,e,f);
		if (exam.isSolvable()) {
			System.out.println("x=: "+exam.getX()+" y=: "+exam.getY());
		}
		else
			System.out.println("The equation has no solution.");
	}

}
