import java.util.Scanner;
public class FirstDayofmomth {

    public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number of year: ");
		int year=input.nextInt();
		System.out.print("Enter the first day of this year: ");
		int number=input.nextInt();

		String[] month= {"0","January","February","March","April","May","June","July","August",
				         "September","October","November","December"};
		String[] day= {"0","Monday","Tuesday","Wendesday","Thursday","Friday","Saturday","Sunday"};
		int[] n= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		int[] num=new int[15];
		
		//若输入的年份为闰年,修改2月天数为29天
		if (year%4==0 && year%100!=0 || year%400==0) {
    	    n[2]=29;
    	}
		num[1]=number;
		for (int i=1;i<=11;i++) {
			for (int j=1;j<=n[i];j++) {
				if (number==7)
					number=1;
				else
					number+=1;
			}
			num[i+1]=number;
		}
		System.out.print("\n");
		for (int i=1;i<=12;i++) {
			System.out.println(month[i]+" 1, "+year+" is "+day[num[i]]);
		}
	}
}
