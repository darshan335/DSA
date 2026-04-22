package com.gqt;

import java.util.Arrays;
import java.util.Scanner;

// Sort the array elements in descending order
class SortElem {
	public static int[] descSort(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}

public class Assignment10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter " + size + " elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		int[] result = SortElem.descSort(arr);
		System.out.println("Sorted array elements in descending order : " + Arrays.toString(result));
	}

}
