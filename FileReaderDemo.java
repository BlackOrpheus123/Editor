package editor;

import java.io.*;

class FileReaderDemo {
	public static void main(String args[]) throws Exception {
		FileReader fr = new FileReader("C:\\FileReaderDemo.java");
		BufferedReader br = new BufferedReader(fr);
		String s;
		while ((s = br.readLine()) != null) {
			System.out.println(s);
		}
		fr.close();
	}
}