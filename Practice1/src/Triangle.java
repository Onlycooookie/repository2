import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a point's x- and y-coordinates£º");
		
		float x=input.nextFloat();
		float y=input.nextFloat();
		
		if (x>0 && y>0 && y<(x*(-1.0/2)+100))
			System.out.println("The point is in the triangle");
		else
			System.out.println("The point is not in the triangle");
	}

}
