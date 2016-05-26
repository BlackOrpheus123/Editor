package editor;

import java.io.*;

class FileReaderDemo {
	public static void main(String args[]) throws Exception {
		FileReader fr = new FileReader("src\\editor\\FileReaderDemo.java");
		BufferedReader br = new BufferedReader(fr);
		String s;

		FileWriter f1 = new FileWriter("file.txt");
		
		
		

		while ((s = br.readLine()) != null) {
			f1.write(s);
			f1.write(System.lineSeparator());
		}
		

		f1.close();

		fr.close();
	}
}