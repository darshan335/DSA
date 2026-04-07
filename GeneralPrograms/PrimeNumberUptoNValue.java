package com.gqt;

import java.util.Scanner;

class PrimeNum {
	public static void pNN(int n) {
		int factor = 0;
		System.out.println("\n Prime numbers upto " + n + " :");
		System.out.println("-----------------------------------");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					factor++;
				}
			}
			if (factor == 2) {
				System.out.println(i + " ");
			}
			factor = 0;
		}

	}
}

public class PrimeNumberUptoNValue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = scan.nextInt();
		PrimeNum.pNN(n);
	}

}
