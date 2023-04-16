package grammar.io.buffer;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
  
public class TestBuffer {
  
    public static void main(String[] args) {
        // ׼���ļ�lol.txt���е�������
        // garen kill teemo
        // teemo revive after 1 minutes
        // teemo try to garen, but killed again
        File f = new File("d:/testFile/lol.txt");
        File f2 = new File("d:/testFile/lol2.txt");
        // �����ļ��ַ���
        // ���������뽨����һ�����ڵ����Ļ�����
        try (
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
        		FileReader fr2 = new FileReader(f2);
                BufferedReader br2 = new BufferedReader(fr2);
            )
        {
        	System.out.println("lol.txt:");
            while (true) {
                // һ�ζ�һ��
                String line = br.readLine();
                if (null == line)
                    break;
                System.out.println(line);
            }
            System.out.println("lol2.txt:");
            while (true) {
                // һ�ζ�һ��
                String line = br2.readLine();
                if (null == line)
                    break;
                System.out.println(line);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
  
    }
}
