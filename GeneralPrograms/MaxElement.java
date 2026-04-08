package com.gqt;

import java.util.Scanner;

class Test2 {
	public static int mE(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;

	}
}

public class MaxElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = scan.nextInt();
		int[] arr = new int[size];

		// Accepting array element
		System.out.println("Enter " + size + " elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		int result = Test2.mE(arr);
		System.out.println("Maximum element = " + result);
	}

}
