import java.util.Scanner;
public class TestQuadraticEquation_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		
		System.out.print("ÊäÈëa:");
		double a=input.nextDouble();
		System.out.print("ÊäÈëb:");
		double b=input.nextDouble();
		System.out.print("ÊäÈëc:");
		double c=input.nextDouble();
		
		QuadraticEquation_10 exam=new QuadraticEquation_10(a,b,c);
		if (exam.getDiscriminant()==0) {
			System.out.println("x1=x2= "+exam.getRoot1());
		}
		else if (exam.getDiscriminant()>0) {
			System.out.println("x1= "+exam.getRoot1());
			System.out.println("x2= "+exam.getRoot2());
		}
		else
			System.out.println("The equation has no roots.");
	}

}
