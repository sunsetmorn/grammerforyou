package grammar.io.buffer;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
  
public class TestBuffer {
  
    public static void main(String[] args) {
        // 准备文件lol.txt其中的内容是
        // garen kill teemo
        // teemo revive after 1 minutes
        // teemo try to garen, but killed again
        File f = new File("d:/testFile/lol.txt");
        File f2 = new File("d:/testFile/lol2.txt");
        // 创建文件字符流
        // 缓存流必须建立在一个存在的流的基础上
        try (
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
        		FileReader fr2 = new FileReader(f2);
                BufferedReader br2 = new BufferedReader(fr2);
            )
        {
        	System.out.println("lol.txt:");
            while (true) {
                // 一次读一行
                String line = br.readLine();
                if (null == line)
                    break;
                System.out.println(line);
            }
            System.out.println("lol2.txt:");
            while (true) {
                // 一次读一行
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
