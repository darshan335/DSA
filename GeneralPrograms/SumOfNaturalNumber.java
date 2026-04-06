package com.gqt;

import java.util.Scanner;

class Demo1 {
	public static void sON(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;

		}
		System.out.println("Sum of number up to " + n + " = " + sum);
	}
}

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();
		Demo1.sON(n);
	}

}
