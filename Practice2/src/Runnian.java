
public class Runnian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
        for (int year=101;year<=2100;year++) {
        	if (year%4==0 && year%100!=0 || year%400==0) {
        		n+=1;
        		if (n%11==0)
            		System.out.print("\n");
            	else
            		System.out.print(year+" ");
        	}
        }
        System.out.print("\n");
        System.out.println("Sum: "+n);
	}
}
