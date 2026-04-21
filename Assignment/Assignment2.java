package com.gqt;

import java.util.Scanner;

// Find the sum of even elements present in an array
class SumOfEven {
	public static int sumOfEven(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		return sum;
	}
}

public class Assignment2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter " + size + " elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		int result = SumOfEven.sumOfEven(arr);
		System.out.println("Sum of even number present in an array are : " + result);
	}

}
