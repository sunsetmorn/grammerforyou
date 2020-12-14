package grammar.test.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestSplitFile {
	public static void main(String[] args) {
		File f = new File("d:/testFile/xihao.png");
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(f);
			File of = null;
			byte[] a = new byte[(int) f.length()];
			fis.read(a);
			int j = 0;
			for(int i = 0; i <= (int) f.length()/102400;i++) {
				of = new File("d:/testFile/" + i + ".png" + i);
				fos = new FileOutputStream(of);
				for( ; j < 102400 + i * 102400; j++) {
					if(j < f.length()) {
						fos.write(a[j]);
					}else {
						break;
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
