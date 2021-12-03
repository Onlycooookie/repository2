import java.util.Random;
public class Practice9_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random n=new Random(1000);
        for (int i=0;i<50;i++) {
        	System.out.println(n.nextInt(100));
        }
	}

}
