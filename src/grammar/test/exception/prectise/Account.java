package grammar.test.exception.prectise;

public class Account {
	private Double balance;

	public void deposit(Double upamount) {
		this.balance +=  upamount;
	}
	
	public void withdraw(Double reduceAmount) throws OverdraftException {
		if(this.balance <  reduceAmount) {
			throw new OverdraftException(this,reduceAmount);
		}else {
			this.balance -=  reduceAmount;
		}
	}
	
	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
}
