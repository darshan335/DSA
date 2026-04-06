package com.gqt;

import java.util.Scanner;

class Demo4 {
	public static void nPM(int n) {
		int factors = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i % j == 0) {
					factors++;
				}
			}
			if (factors == 2) {
				System.out.println(i + " is a prime");
			} else {
				System.out.println(i + " is not a prime");
			}
			factors = 0;
		}
	}
}

public class NPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int n = sc.nextInt();
		Demo4.nPM(n);
	}

}
