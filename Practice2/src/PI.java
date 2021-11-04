
public class PI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("i"+"              "+"PI");
		System.out.print("\n");
		for (int i=10000;i<=100000;i+=10000) {
			double PI = 0;
			int f=1;
			for (int j=1;j<=2*i-1;j+=2) {
				PI+=f*(1.0/j);
				f=-f;
			}
			if (i<100000)
				System.out.print(i+"       ");
			else
				System.out.print(i+"      ");
			System.out.printf("%.5f",4*PI);
			System.out.print("\n");
		}
	} 

}
