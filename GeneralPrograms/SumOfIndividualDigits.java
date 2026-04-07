package com.gqt;

import java.util.Scanner;

class Sum {
	public static void sOID(int n) {
		int r = 0;
		int sum = 0;
		while (n > 0) {
			r = n % 10;
			sum += r;
			n = n / 10;

		}
		System.out.println("Sum of individual digits : " + sum);
	}
}

public class SumOfIndividualDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = scan.nextInt();
		Sum.sOID(n);
	}

}
