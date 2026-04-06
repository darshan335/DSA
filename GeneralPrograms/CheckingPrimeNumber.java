package com.gqt;

import java.util.Scanner;

class Demo3 {
	public static void isPrime(int n) {
		int factors = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				factors++;
			}
		}
		if (factors == 2) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}
	}
}

public class CheckingPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int n = sc.nextInt();
		Demo3.isPrime(n);
	}

}
