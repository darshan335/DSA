package com.gqt;

import java.util.Scanner;

class Swap {
	public static void swapNumbers(int a, int b) {
		System.out.println("Before Swapping");
		System.out.println("------------------");
		System.out.println("a = " + a + "\nb = " + b);
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping");
		System.out.println("------------------");
		System.out.println("a = " + a + "\nb = " + b);
	}
}

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a : ");
		int a = sc.nextInt();
		System.out.println("Enter b : ");
		int b = sc.nextInt();
		Swap.swapNumbers(a, b);
	}

}
