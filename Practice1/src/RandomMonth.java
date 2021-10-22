import java.util.Random;
public class RandomMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		Random n =new Random();
		month=n.nextInt(12)+1;
		System.out.println("生成的随机数: "+month);
		
		if (month==1)
			System.out.println("对应的月份:January");
		else if (month==2)
			System.out.println("对应的月份:February");
		else if (month==3)
			System.out.println("对应的月份:March");
		else if (month==4)
			System.out.println("对应的月份:April");
		else if (month==5)
			System.out.println("对应的月份:May");
		else if (month==6)
			System.out.println("对应的月份:June");
		else if (month==7)
			System.out.println("对应的月份:July");
		else if (month==8)
			System.out.println("对应的月份:August");
		else if (month==9)
			System.out.println("对应的月份：September");
		else if (month==10)
			System.out.println("对应的月份:Octorber");
		else if (month==11)
			System.out.println("对应的月:November");
		else
			System.out.println("对应的月份:December");
	}

}
