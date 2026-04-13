package com.gqt;

import java.util.Scanner;

class Fxp {
	public static int m23(int x, int n) {
		if (n == 0) {
			return 1;
		} else {
			return x * m23(x, n - 1);
		}
	}
}

public class FindingXPowN {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter x : ");
		int x = scan.nextInt();
		System.out.print("Enter n : ");
		int n = scan.nextInt();
		int res = Fxp.m23(x, n);
		System.out.println("Result = " + res);

	}

}
