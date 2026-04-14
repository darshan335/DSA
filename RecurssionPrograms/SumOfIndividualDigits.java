package com.gqt;

import java.util.Scanner;

class Sum {
	public static int s1(int n) {
		if (n == 0) {
			return 0;
		} else {
			return n % 10 + s1(n / 10);
		}
	}
}

public class SumOfIndividualDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = scan.nextInt();
		int result = Sum.s1(n);
		System.out.println("Result = " + result);
	}

}
