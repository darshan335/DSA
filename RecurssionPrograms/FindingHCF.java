package com.gqt;

import java.util.Scanner;

class FindHCF {
	public static int findGCD(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return findGCD(b, a % b);
		}
	}
}

public class FindingHCF {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int a = scan.nextInt();
		System.out.print("Enter 2nd number : ");
		int b = scan.nextInt();
		if (a < 0 && b < 0) {
			System.out.println("Invalid input");
			System.exit(0);
		} else {
			int result = FindHCF.findGCD(a, b);
			System.out.println("GCD of " + a + " and " + b + " = " + result);
		}
	}

}
