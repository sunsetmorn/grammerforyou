package grammar.exception.first;

public class Testmyexception {

	public static void main(String[] args) {
		try {
			System.out.println("�����쳣��ʼ��");
			System.out.println("�Զ����쳣1");
			createException();
		}catch(Myexception e) {
			System.out.println("�쳣�Ѳ���" + e);
			e.printStackTrace();
		}
	}
	public static void createException() throws Myexception {
		System.out.println("ǿ������һ���쳣");
		throw new Myexception();
	}
}
