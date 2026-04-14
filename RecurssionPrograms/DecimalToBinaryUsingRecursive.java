package com.gqt;

import java.util.Scanner;

class DtoBUR {
	public static int decimalToBin(int n) {
		if (n == 0) {
			return 0;
		} else {
			return n % 2 + 10 * decimalToBin(n / 2);
		}
	}
}

public class DecimalToBinaryUsingRecursive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = scan.nextInt();
		int result = DtoBUR.decimalToBin(n);
		System.out.println("Result = "+result);
	}

}
