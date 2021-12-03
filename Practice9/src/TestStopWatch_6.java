import java.util.Random;
import java.util.Arrays;
public class TestStopWatch_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] number=new int[100000];
        Random n=new Random();
        
        //产生100000个随机数
        for (int i=0;i<100000;i++) {
        	number[i]=n.nextInt(100000);
        }
        
        //计时
        StopWatch_6 t=new StopWatch_6();
        Arrays.sort(number);
        t.stop();
        
        System.out.println(t.getElaspsedTime());
        
	}

}
