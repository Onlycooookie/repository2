import java.util.GregorianCalendar;
public class Practice9_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //Task1
		GregorianCalendar t = new GregorianCalendar();
		int year=t.get(GregorianCalendar.YEAR);
		int month=t.get(GregorianCalendar.MONTH);
		int date=t.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println(year+"��"+month+"��"+date+"��");
        
		//Task2
        t.setTimeInMillis(1234567898765L);
        int Year=t.get(GregorianCalendar.YEAR);
		int Month=t.get(GregorianCalendar.MONTH);
		int Date=t.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println(Year+"��"+Month+"��"+Date+"��");
	}
	
}
