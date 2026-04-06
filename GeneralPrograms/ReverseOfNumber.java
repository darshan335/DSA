package com.gqt;

import java.util.Scanner;

class Reverse {
	public static void findReverse(int n) {
		int r = 0;
		int rev = 0;
		while (n > 0) {
			r = n % 10;
			rev = r + (rev * 10);
			n = n / 10;
		}
		System.out.println("Reverse = " + rev);
	}
}

public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any numbner : ");
		int n = sc.nextInt();
		Reverse.findReverse(n);
	}

}
