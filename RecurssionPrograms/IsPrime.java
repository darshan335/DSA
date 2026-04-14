package com.gqt;

import java.util.Scanner;

class Ip {
	public static boolean iPM(int n, int i) {
		if (i == 1) {
			return true;
		} else if (n % i == 0) {
			return false;
		} else {
			return iPM(n, --i);
		}
	}
}

public class IsPrime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = scan.nextInt();
		boolean result = Ip.iPM(n, n / 2);
		if (result) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}
	}

}
