package com.gqt;

import java.util.Scanner;

class Fact {
	public static void findFact(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			//fact = fact * i;
			fact *= i;
		}
		System.out.println(n + "! = " + fact);
	}
}

public class FindFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int n = sc.nextInt();
		Fact.findFact(n);
	}

}
