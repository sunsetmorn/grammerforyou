package grammar.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class TestStream {
 
    public static void main(String[] args) {
        try {
            File f = new File("d:/testFile/1.txt");
            // ���������ļ���������
            FileInputStream fis = new FileInputStream(f);
            // ͨ��������������Ϳ��԰����ݴ�Ӳ�̣���ȡ��Java�������������Ҳ���Ƕ�ȡ���ڴ���
            //�����ֽ����飬�䳤�Ⱦ����ļ��ĳ���
            byte[] all =new byte[(int) f.length()];
            //���ֽ�������ʽ��ȡ�ļ���������
            fis.read(all);
            for (byte b : all) {
                //��ӡ������65 66
                System.out.println(b);
            }
            //ÿ��ʹ����������Ӧ�ý��йر�
            fis.close();
            
            // ׼���ļ�lol2.txt���е������ǿյ�
            File f2 = new File("d:/testFile/lol2.txt");
            // ׼��������2���ֽ����飬��88,89��ʼ�������Ӧ���ַ��ֱ���X,Y
            byte data[] = { 88, 89 };
 
            // ���������ļ��������
            FileOutputStream fos = new FileOutputStream(f2);
            // ������д�뵽�����
            fos.write(data);
            // �ر������
            fos.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
 
    }
}
