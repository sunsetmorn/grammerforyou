package grammar.exception.prectise;

public class TestAmount {
	public static void main(String[] args) {
		Account lisi = new Account();
		lisi.setBalance(1234.23);
		try {
			lisi.withdraw(5431.23);
		}catch(OverdraftException e) {
			System.out.println("͸֧�쳣��");
			e.printStackTrace();
		}finally {
			try {
				CheckingAccount newAmount = new CheckingAccount();
				newAmount.setBalance(1234.23);
				newAmount.setOverdraftProtection(1542.33);
				newAmount.withdraw(5431.23);
			}catch(OverdraftException e) {
				System.out.println("͸֧��Ȳ��㣺");
				e.printStackTrace();
			}
		}
	}
}
