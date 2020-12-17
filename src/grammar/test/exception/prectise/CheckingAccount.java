package grammar.test.exception.prectise;

public class CheckingAccount extends Account {
	private Double overdraftProtection;
	
	@Override
	public void deposit(Double upamount) {
		super.setBalance(super.getBalance() + upamount);
	}
	
	@Override
	public void withdraw(Double reduceAmount) throws OverdraftException{
		if(super.getBalance() + this.overdraftProtection < reduceAmount) {
			throw new OverdraftException(this,reduceAmount);
		}
	}

	public Double getOverdraftProtection() {
		return overdraftProtection;
	}

	public void setOverdraftProtection(Double overdraftProtection) {
		this.overdraftProtection = overdraftProtection;
	}
	
	
}
