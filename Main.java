package com.icloud.sclubber;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		File fileOne = new File("E:/test/first.txt");
		File fileTwo = new File("E:/test/second.txt");
		File fileThree = new File("E:/test/result.txt");
		String result = "";
		String text = ReadFile.readFromFile(fileOne);
		String[] textOne = text.split("( |\n)");
		text = ReadFile.readFromFile(fileTwo);
		String[] textTwo = text.split("( |\n)");
		for (int i = 0; i < textOne.length; i++) {
			for (int j = 0; j < textTwo.length; j++) {
				if (textTwo[j].compareToIgnoreCase(textOne[i]) == 0) {
					result += textOne[i] + System.lineSeparator();
					try (PrintWriter pw = new PrintWriter(fileThree)) {
						pw.println(result);
					} catch (IOException e) {
						System.out.println(e);
					}
				}
			}
		}

	}

}
