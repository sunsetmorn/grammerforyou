package grammar.test.exception.prectise;

public class OverdraftException extends Exception {
	public OverdraftException() {
		
	}
	public OverdraftException(Account amount,Double money) {
		super("账户余额为：" + amount.getBalance().toString() + ",不足抵扣" + money);
	}
	
	public OverdraftException(CheckingAccount amount,Double money) {
		super("账户余额" + amount.getBalance().toString() +"加上透支金额"+ amount.getOverdraftProtection() + ",不足抵扣" + money);
	}
}
