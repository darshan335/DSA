package com.gqt;

import java.util.Scanner;

class Demo18 {
	public static int findFac(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * findFac(n - 1);
		}
	}

}

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the vaule of n : ");
		int n = scan.nextInt();
		int result = Demo18.findFac(n);
		System.out.println("Result = " + result);
	}

}
