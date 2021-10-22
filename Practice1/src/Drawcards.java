import java.util.Random;
public class Drawcards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] num=new String[]{"Ace","2","3","4","5","6","7","8","9","10","Jack","Quene","King"};
		String[] color=new String[]{"Clubs","Diamonds","Hearts","Spades"};
		int x;
		int y;
		Random n =new Random();
		x=n.nextInt(13);
		y=n.nextInt(4);
		
		System.out.println("The card you picked is "+num[x]+" of "+color[y]);
	}
}
