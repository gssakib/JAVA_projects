package demo;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		String result = 's' + 'f';
		System.out.println(result);
	}
	public static String stripDigits(String str) {
		String result = "";
		
		if (str == null)
		return null;
		for (int i = 0; i < str.length(); i++) {
		if (!Character.isDigit(str.charAt(i)))
		result += str.charAt(i);
		}
		return result;
		}

}
