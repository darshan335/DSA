package com.gqt;

import java.util.Scanner;

class Test {
	public static void sWT(int a, int b) {
		System.out.println("Before swapping");
		System.out.println("a = " + a + " b = " + b);
		// Logic-1
		// a = a + b;
		// b = a - b;
		// a = a - b;

		// Logic-2
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("After swapping");
		System.out.println("a = " + a + " b = " + b);

	}
}

public class SwapWithoutTemp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a : ");
		int a = sc.nextInt();
		System.out.print("Enter b : ");
		int b = sc.nextInt();
		Test.sWT(a, b);

	}

}
