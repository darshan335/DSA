package com.gqt;

import java.util.Scanner;

class Nm {
	public static void m2(int n) {
		if (n >= 1) {
			m2(n - 1);
			System.out.print(n + " ");
		} else {
			return;
		}
	}
}

public class NaturalNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = scan.nextInt();
		Nm.m2(n);
	}

}
