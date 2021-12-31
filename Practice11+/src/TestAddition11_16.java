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
		
		//只要输入的不是正确答案，就继续
		while (number1 + number2 != answer) {
			//如果输入相同答案，要弹出警告并退出
			while (list.contains(answer)) {
				System.out.println("You already entered "+answer);
		        break;
		    }
		    System.out.print("Wrong answer.try again. What is "+number1+" + "+ number2+"? ");
		    //在list中加入这个错误答案(可能是list中已经有的)
		    list.add(answer);
		    answer = input.nextInt();
		}
		System.out.println("You got it!");
	}
}
