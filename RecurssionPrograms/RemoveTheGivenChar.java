package com.gqt;

import java.util.Scanner;

class Rthe {
	public static String newString(String s, char ch, int i) {
		if (i < 0) {
			return "";
		} else if (ch == s.charAt(i)) {
			return newString(s, ch, i - 1);
		} else {
			return newString(s, ch, i - 1) + s.charAt(i);
		}
	}
}

public class RemoveTheGivenChar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter String : ");
		String s = scan.nextLine();
		System.out.print("Enter the character to remove : ");
		char ch = scan.nextLine().charAt(0);
		String result = Rthe.newString(s, ch, s.length() - 1);
		System.out.println("String after removing '" + ch + "' = " + result);
	}

}
