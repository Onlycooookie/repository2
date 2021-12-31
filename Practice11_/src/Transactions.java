import java.util.Date;
public class Transactions {
	public Date date;
	public char type;
	public double amount;
	public double balance;
	public String description;
	public Transactions(char c, double a, double b, String d) {
		date = new Date();
		type = c;
		amount = a;
		balance = b;
		description = d;
	}

}
