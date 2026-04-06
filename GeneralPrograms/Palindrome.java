package com.gqt;

import java.util.Scanner;

class findPalindrome {
	public static void coreLogic(int n) {
		int n1 = n;
		int r = 0;
		int rev = 0;
		while (n > 0) {
			r = n % 10;
			rev = r + (rev * 10);
			n = n / 10;
		}
		System.out.println("Reverse = " + rev);
		if (rev == n1) {
			System.out.println(n1 + " is a Palindrome");

		} else {
			System.out.println(n1 + " is not a Palindrome");
		}
	}
}

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int n = sc.nextInt();
		findPalindrome.coreLogic(n);
	}

}
