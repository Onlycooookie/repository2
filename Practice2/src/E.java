
public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("  i"+"            "+"e");
		System.out.print("\n");
		for (int n=10000;n<=100000;n+=10000) {
			double E = 1;
			double item=1;
			for (int i=2;i<=n;i++) {
				item=item/i;
				E+=item;
			}
			if (n<100000)
				System.out.print(n+"       ");
			else
				System.out.print(n+"      ");
			System.out.printf("%.3f",E+1);
			System.out.print("\n");
		}
	}
}
