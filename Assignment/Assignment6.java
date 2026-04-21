package com.gqt;

import java.util.Scanner;

// Find the sum of only prime numbers present in an array
class SumOfPrime {
	public static int isPrimeNum(int[] arr) {
		int sum = 0;
		int factors = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j <= arr[i]; j++) {
				if (arr[i] % j == 0) {
					factors++;

				}

			}
			if (factors == 2) {
				sum += arr[i];

			}
			factors = 0;
		}
		return sum;

	}
}

public class Assignment6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter " + size + " elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		int result = SumOfPrime.isPrimeNum(arr);
		System.out.println("Sum of prime numbers in an array : " + result);
	}
}
