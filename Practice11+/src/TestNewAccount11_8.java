
public class TestNewAccount11_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewAccount11_8 a = new NewAccount11_8(0.015,1122, 1000, "George");
		a.deposit(30, "First deposit");
		a.deposit(40, "Second deposit");
		a.deposit(50, "Third deposit");
		a.withDraw(5, "First withdraw");
		a.withDraw(4, "Sceond withdraw");
		a.withDraw(2, "Third withdraw");
		System.out.println("name :" + a.getName() + " rate: " + a.getAnnualInterestRate() + " balance: " + a.getBalance() + "\n");
		
		for (Transactions b : a.transactions) {
			System.out.println("date: " + b.date);
			System.out.println("type: " + b.type);
			System.out.println("amount: " + b.amount);
			System.out.println("new balance: " + b.balance);
			System.out.println("description: " + b.description);
			System.out.print("\n");
		}
	}

}
