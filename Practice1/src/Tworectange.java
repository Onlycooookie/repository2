import java.util.Scanner;
public class Tworectange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a r1's x-,y-coordinates,width, and height£º");
		float x1=input.nextFloat();
		float y1=input.nextFloat();
		float w1=input.nextFloat();
		float h1=input.nextFloat();
		System.out.print("Enter a r2's x-,y-coordinates,width, and height£º");
		float x2=input.nextFloat();
		float y2=input.nextFloat();
		float w2=input.nextFloat();
		float h2=input.nextFloat();
		
		if ((x2+w2/2)<=(x1+w1/2) && (x2-w2/2)>=(x1-w1/2) && (y2+h2/2)<=(y1+h1/2) && (y2-h2/2)>=(y1-h1/2))
			System.out.println("r2 is inside r1");
		else if ((x2+w2/2)>=(x1+w1/2) && (x2-w2/2)<=(x1+w1/2) && Math.abs(y2-y1)<=h1/2+h2/2
				||(y2+h2/2)>=(y1+h1/2) && (y2-h2/2)>=(y1+h1/2) && Math.abs(x2-x1)<=w1/2+w2/2)
			System.out.println("r2 overlaps r1");
		else
			System.out.println("r2 does not overlaps r1");
    }
}
