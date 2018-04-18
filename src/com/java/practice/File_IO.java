package com.java.practice;

import java.io.*;
import java.io.IOException;
//import java.nio.charset.Charset;
//import java.nio.charset.StandardCharsets;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.Scanner;

public class File_IO {

	public static void main(String args[]) throws IOException {

		FileInputStream in = null;
		FileOutputStream out = null;

		String inFile = "/Users/naveenakadem/Desktop/input.txt";
		String outFile = "/Users/naveenakadem/Desktop/output.txt";

		try {
			in = new FileInputStream(inFile);
			out = new FileOutputStream(outFile);

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			if (in != null)
				in.close();
			if (out != null)
				out.close();
		}

	}

}
