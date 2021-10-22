import java.util.Scanner;
public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		float x=input.nextFloat();
		float y=input.nextFloat();
		x=(float)x;
		y=(float)y;
		if (x*x+y*y<=100)
			System.out.printf("Point "+"("+x+", "+y+")"+" is in the circle");
		else
			System.out.printf("Point "+"("+x+", "+y+")"+" is not in the circle");
	}

}
