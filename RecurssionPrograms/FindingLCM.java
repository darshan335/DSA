package com.gqt;

import java.util.Scanner;

class Lcm {
	public static int lcm = 1;

	public static int findLCM(int a, int b) {
		if (lcm % a == 0 && lcm % b == 0) {
			return lcm;
		} else {
			lcm++;
			return findLCM(a, b);
		}
	}
}

public class FindingLCM {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of a : ");
		int a = scan.nextInt();
		System.out.print("Enter the value of b : ");
		int b = scan.nextInt();
		int result = Lcm.findLCM(a, b);
		System.out.println("LCM of " + a + " and " + b + " = " + result);

	}

}
