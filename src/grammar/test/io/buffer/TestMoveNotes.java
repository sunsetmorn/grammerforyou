package grammar.test.io.buffer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestMoveNotes {
	public static void main(String[] args) {
		File f =new File("d:/testFile/lol.txt");
		File q =new File("d:/testFile/lol2.txt");
		try (FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(q);
			PrintWriter pw = new PrintWriter(fw);){
			while (true) {
	            String line = br.readLine();
	            if (null == line)
	                break;
	            if(line.indexOf("//") != 0) {
	            	pw.println(line);
	            }
			}
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
}
