package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Keyboard {
	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static String readString() {
		String str = null;
		try {
			str = in.readLine();
		} catch(IOException e) {
			e.printStackTrace();
		}
		return str;
	}
	
	public static String readString(String prompt) {
		System.out.print(prompt);
		return readString();
	}
	
	public static int readInt() {
		return Integer.parseInt(readString());
	}
	
	public static int readInt(String prompt) {
		return Integer.parseInt(readString(prompt));
	}
	
	public static int readInt(String prompt, String errorMessage) {
		while (true) {
			try {
				return Integer.parseInt(readString(prompt));				
			} catch(NumberFormatException e) {
				System.out.println(errorMessage);
			}
		}
	}
}












