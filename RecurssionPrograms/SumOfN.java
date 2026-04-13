package com.gqt;

import java.util.Scanner;

class New {
	public static int m12(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n + m12(n - 1);
		}
	}
}

public class SumOfN {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = scan.nextInt();
		int result=New.m12(n);
		System.out.println("Result = "+ result);

	}

}
