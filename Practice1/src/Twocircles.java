import java.util.Scanner;
public class Twocircles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a circle1's x-,y-coordinates,and radius£º");
		float x1=input.nextFloat();
		float y1=input.nextFloat();
		float r1=input.nextFloat();
		System.out.print("Enter a circle1's x-,y-coordinates,and radius£º");
		float x2=input.nextFloat();
		float y2=input.nextFloat();
		float r2=input.nextFloat();
		
		if (Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))<=Math.abs(r1-r2))
			System.out.println("circle2 is in the circle1");
		else if(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))<=r1+r2)
			System.out.println("circle2 overlaps circle1");
		else
			System.out.println("circle2 does not overlap circle1");
	}
}
