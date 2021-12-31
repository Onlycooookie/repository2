import java.util.Date;
public class Account9_7 {
	private int id=0;
	private double balance=0.0;
	private double annualInterestRate=0.0;
	private Date dateCreated;
	
	public Account9_7(){
	}
	
    public Account9_7(int id,double balance){
		this.id=id;
		this.balance=balance;
	}
    public int getId() {
    	return id;
    }
    public double getBalance() {
    	return balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setId(int id) {
    	this.id=id;
    }
    public void setBalance(double balance) {
    	this.balance=balance;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public Date getDateCreated(){
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate / 1200;
    }
    public double getMonthlyInterest(){
        return annualInterestRate * balance / 1200;
    }
    public void withDraw(double num){
        if (num <= balance) 
        	balance -= num;
    }
    public void deposit(double num){
        balance += num;
    }
}
