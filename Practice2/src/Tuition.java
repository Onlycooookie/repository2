
public class Tuition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int tuition=1000;
        double rate=0.05;
        int tuition_10=tuition;
        int total_tuition_4=0;
        
        for (int i=0;i<10;i++) {
        	tuition_10*=1+rate;
        }
        for (int i=0;i<4;i++) {
        	tuition_10*=1+rate;
        	total_tuition_4+=tuition_10;
        }
        System.out.println("Ten yaer's tuition is: "+tuition_10);
        System.out.println("Four years' tuition is: "+total_tuition_4);
	}

}
