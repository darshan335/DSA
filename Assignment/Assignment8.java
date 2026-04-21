package com.gqt;

import java.util.Scanner;

// Find the sum of squares of array elements and check wheather sum is divisible by 5 or not
class SumOfSquares {
	public static void sumOfSqr(int[] arr) {
		int sum = 0;
		System.out.print("Sum of squares of array elements : [ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] * arr[i] +" ");
			sum += arr[i] * arr[i];
		}
		System.out.print("]");
	
		if (sum % 5 == 0) {
			System.out.println(" = "+sum + " is divisible by 5");
		} else {
			System.out.println(" = "+sum + " is not divisible by 5");
		}
	}
}

public class Assignment8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter " + size + " elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		SumOfSquares.sumOfSqr(arr);
	}

}
