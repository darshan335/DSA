package com.gqt;

import java.util.Scanner;

class Fib {
	public static int fibUR(int x) {
		if (x == 0 || x == 1) {
			return x;
		} else {
			return fibUR(x - 1) + fibUR(x - 2);
		}
	}
}

public class FibonacciUsingRecursion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = scan.nextInt();
		System.out.println("Fibonacci series upto " + n + " = ");
		for (int i = 0; i < n; i++) {
			System.out.print(Fib.fibUR(i)+" ");
		}
	}

}
