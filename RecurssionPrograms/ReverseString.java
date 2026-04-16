package com.gqt;

import java.util.Scanner;

class Rs {
	public static String rev(String s) {
		if (s == null || s.length() == 1) {
			return s;
		} else {
			return rev(s.substring(1)) + s.charAt(0);
		}
	}
}

public class ReverseString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any string : ");
		String s = scan.nextLine();
		String reverse = Rs.rev(s);
		System.out.println("Reversed string = " + reverse);
	}

}
