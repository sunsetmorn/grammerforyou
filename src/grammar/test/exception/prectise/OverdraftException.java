package grammar.test.exception.prectise;

public class OverdraftException extends Exception {
	public OverdraftException() {
		
	}
	public OverdraftException(Account amount,Double money) {
		super("�˻����Ϊ��" + amount.getBalance().toString() + ",����ֿ�" + money);
	}
	
	public OverdraftException(CheckingAccount amount,Double money) {
		super("�˻����" + amount.getBalance().toString() +"����͸֧���"+ amount.getOverdraftProtection() + ",����ֿ�" + money);
	}
}
