import java.util.Date;
public class Practice9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Date d1 = new Date(10000);
        System.out.println(d1.toString());

        Date d2 = new Date(100000);
        System.out.println(d2.toString());

        Date d3 = new Date(1000000);
        System.out.println(d3.toString());

        Date d4 = new Date(10000000);
        System.out.println(d4.toString());

        Date d5 = new Date(100000000);
        System.out.println(d5.toString());

        Date d6 = new Date(1000000000);
        System.out.println(d6.toString());

        Date d7 = new Date(10000000000L);
        System.out.println(d7.toString());

        Date d8 = new Date(100000000000L);
        System.out.println(d8.toString());*/
        
        int time=10000;
        for (int i=0;i<8;i++) {
        	Date d=new Date(time);
        	System.out.println(d.toString());
        	time*=10;
        }
        
	}
}
