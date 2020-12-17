package grammar.test.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestMergeFile {
	public static void main(String[] args) {
		File ee = new File("d:/testFile/");
		File f = new File("d:/testFile/xihao2.png");
		File g = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(f);
			String[] ifs = ee.list();
			System.out.println(ifs);
			for(int i = 0 ; i < ifs.length ; i++) {
				for(int j = 0 ; j < ifs.length ; j++) {
					System.out.println(i);
					String a = i + ".png" + i;
					if(ifs[j].indexOf(a) >= 0) {
						g = new File("d:/testFile/" + a);
						fis = new FileInputStream(g);
						byte[] b = new byte[(int)g.length()];
						fis.read(b);
						fos.write(b);
					}
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try{
				fis.close();
				fos.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
