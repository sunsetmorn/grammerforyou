package grammar.exception.first;

public class Testmyexception {

	public static void main(String[] args) {
		try {
			System.out.println("捕获异常开始：");
			System.out.println("自定义异常1");
			createException();
		}catch(Myexception e) {
			System.out.println("异常已捕获：" + e);
			e.printStackTrace();
		}
	}
	public static void createException() throws Myexception {
		System.out.println("强行制造一个异常");
		throw new Myexception();
	}
}
