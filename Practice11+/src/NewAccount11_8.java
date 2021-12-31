import java.util.ArrayList;
import java.util.Date;
public class NewAccount11_8 {
	private int id;
	private double balance;
	private double Rate;
	private Date dateCreated;
	private String name;
	ArrayList<Transactions> transactions;
	public NewAccount11_8() {
		id = 0;
		balance = 0;
		Rate = 0;
		dateCreated = new Date();
		transactions = new ArrayList<Transactions>();
	}

	public NewAccount11_8(int i, double b) {
		id = i;
		balance = b;
		Rate = 0;
		dateCreated = new Date();
		transactions = new ArrayList<Transactions>();
	}

	public NewAccount11_8(double R,int i, double b, String n) {
		id = i;
		balance = b;
		Rate = R;
		dateCreated = new Date();
		name = n;
		transactions = new ArrayList<Transactions>();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
    	this.id=id;
    }

	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
    	this.balance=balance;
    }

	public double getAnnualInterestRate() {
		return Rate;
	}
	public void setAnnualInterestRate(double Rate) {
		this.Rate = Rate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	public double getMonthlyInterestRate() {
		return Rate / 12;
	}
	public double getMonthlyInterest() {
		return Rate / 12 * balance;
	}
	public void withDraw(double m, String s) {
		balance -= m;
		transactions.add(new Transactions('W', m, balance, s));
	}
	public void deposit(double m, String s) {
		balance += m;
		transactions.add(new Transactions('D', m, balance, s));
	}

	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	
}


