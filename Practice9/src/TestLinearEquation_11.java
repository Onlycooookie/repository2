import java.util.Scanner;
public class TestLinearEquation_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		
		System.out.print("����a:");
		double a=input.nextDouble();
		System.out.print("����b:");
		double b=input.nextDouble();
		System.out.print("����c:");
		double c=input.nextDouble();
		System.out.print("����d:");
		double d=input.nextDouble();
		System.out.print("����e:");
		double e=input.nextDouble();
		System.out.print("����f:");
		double f=input.nextDouble();
		
		LinearEquation_11 exam=new LinearEquation_11(a,b,c,d,e,f);
		if (exam.isSolvable()) {
			System.out.println("x=: "+exam.getX()+" y=: "+exam.getY());
		}
		else
			System.out.println("The equation has no solution.");
	}

}
