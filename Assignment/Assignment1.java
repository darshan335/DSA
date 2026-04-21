package com.gqt;

import java.util.Scanner;

// Find the maximum element present in an array
class MaxEle {
	public static int mE(int[] arr) {
		int max=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter " + size + " Elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		int result = MaxEle.mE(arr);
		System.out.println("Maximum element of an array is : " + result);
	}

}
