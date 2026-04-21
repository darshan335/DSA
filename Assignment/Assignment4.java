package com.gqt;

import java.util.Scanner;

// Find the sum of positive elements present in an array
class SumOfPositive {
	public static int sumOfPositive(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				sum += arr[i];
			}
		}
		return sum;
	}
}

public class Assignment4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter " + size + " elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		int result = SumOfPositive.sumOfPositive(arr);
		System.out.println("Sum of even number present in an array are : " + result);
	}

}
