
public class Wanquanshu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for (int n=3;n<=10000;n++) {
        	int sum=0;
        	for (int i=1;i<n;i++) {
        		if (n%i==0)
        			sum+=i;
        	}
        	if (n==sum)
        		System.out.println(n);
        }
	}

}