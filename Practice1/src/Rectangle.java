import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		float x=input.nextInt();
		float y=input.nextInt();
		x=(float)x;
		y=(float)y;
		if (x<=5 && x>=-5 && y<=2.5 && y>=-2.5)
			System.out.printf("Point "+"("+x+", "+y+")"+" is in the rectangle");
		else
			System.out.printf("Point "+"("+x+", "+y+")"+" is not in the rectangle");
	}
}
