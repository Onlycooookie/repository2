import java.util.ArrayList;
import java.util.Scanner;
public class TestAddition11_16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int number1 = (int) (Math.random()*10);
		int number2 = (int) (Math.random()*10);
		System.out.print("What is "+number1+" + "+number2 +"? ");
		
		int answer = input.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		
		//ֻҪ����Ĳ�����ȷ�𰸣��ͼ���
		while (number1 + number2 != answer) {
			//���������ͬ�𰸣�Ҫ�������沢�˳�
			while (list.contains(answer)) {
				System.out.println("You already entered "+answer);
		        break;
		    }
		    System.out.print("Wrong answer.try again. What is "+number1+" + "+ number2+"? ");
		    //��list�м�����������(������list���Ѿ��е�)
		    list.add(answer);
		    answer = input.nextInt();
		}
		System.out.println("You got it!");
	}
}
