package com.gqt;

import java.util.Scanner;

class Tribonacci {
	public static void tribonacciSeries(int n) {
		int tri0 = 0;
		int tri1 = 0;
		int tri2 = 1;
		int tri;
		System.out.println("Tribonacci series of " + n + " :");
		System.out.println("-----------------------------");
		System.out.print(tri0 + " " + tri1 + " " + tri2 + " ");
		for (int i = 4; i <= n; i++) {
			tri = tri0 + tri1 + tri2;
			System.out.print(tri + " ");
			tri0 = tri1;
			tri1 = tri2;
			tri2 = tri;

		}
	}
}

public class TribonacciSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = scan.nextInt();
		Tribonacci.tribonacciSeries(n);
	}

}
