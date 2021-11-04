
public class Jinzita2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for (int n=1;n<9;n++) {
        	for (int i=0;i<8-n;i++)
        		System.out.print("   ");
        	for (int j=0;j<n;j++) {
        		System.out.print(String.format("%3d",(int)(Math.pow(2,j))));
        	}
        	for (int k=n-2;k>=0;k--) {
        		System.out.print(String.format("%3d",(int)(Math.pow(2,k))));
        	}
        	System.out.print("\n");
        }
	}

}
