import java.util.Random;
public class RandomMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		Random n =new Random();
		month=n.nextInt(12)+1;
		System.out.println("���ɵ������: "+month);
		
		if (month==1)
			System.out.println("��Ӧ���·�:January");
		else if (month==2)
			System.out.println("��Ӧ���·�:February");
		else if (month==3)
			System.out.println("��Ӧ���·�:March");
		else if (month==4)
			System.out.println("��Ӧ���·�:April");
		else if (month==5)
			System.out.println("��Ӧ���·�:May");
		else if (month==6)
			System.out.println("��Ӧ���·�:June");
		else if (month==7)
			System.out.println("��Ӧ���·�:July");
		else if (month==8)
			System.out.println("��Ӧ���·�:August");
		else if (month==9)
			System.out.println("��Ӧ���·ݣ�September");
		else if (month==10)
			System.out.println("��Ӧ���·�:Octorber");
		else if (month==11)
			System.out.println("��Ӧ����:November");
		else
			System.out.println("��Ӧ���·�:December");
	}

}
