package editor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Reader {

	public void loadClasses() throws Exception {
		FileReader fr = new FileReader("src\\editor\\FileReaderDemo.java");
		FileWriter f1 = new FileWriter("file.txt");
		BufferedReader br = new BufferedReader(fr);
		String s;

		while ((s = br.readLine()) != null) {
			f1.write(s);
			f1.write(System.lineSeparator());
		}

		f1.close();

		fr.close();

	}

}
