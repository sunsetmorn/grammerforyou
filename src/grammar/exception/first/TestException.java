package grammar.exception.first;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestException {
	public static void main(String[] args) {
		 
        File f = new File("d:/LOL.exe");
 
        try {
//            throw new FileNotFoundException();
            System.out.println("��ͼ�� d:/LOL.exe");
            new FileInputStream(f);
            System.out.println("�ɹ���");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse("2016-06-03");
        } catch (FileNotFoundException e) {
            System.out.println("d:/LOL.exe������");
            e.printStackTrace();
        } 
        catch (ParseException e) {
            System.out.println("���ڸ�ʽ��������");
            e.printStackTrace();
        }
        finally{
            System.out.println("�����ļ��Ƿ���ڣ� ����ִ�еĴ���");
        }
		
		
    }
	
	
}
