package com.gqt;

import java.util.Arrays;
import java.util.Scanner;

class BinS {
	public static int binarysear(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		int mid;
		while (low <=high) {
			mid = (low + high) / 2;
			if (key == arr[mid]) {
				return mid;
			} else if (key < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}
}

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the " + size + " elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		System.out.print("Enter the key element to search : ");
		int key = scan.nextInt();
		int res = BinS.binarysear(arr, key);
		if (res == -1) {
			System.out.println(key + " Not Found");
		} else {
			System.out.print(key + " found");
		}
	}

}
