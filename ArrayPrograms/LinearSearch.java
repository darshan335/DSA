package com.gqt;

import java.util.Arrays;
import java.util.Scanner;

class LinS {
	public static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (key == arr[i]) {
				return i;
			}
		}
		return -1;
	}
}

public class LinearSearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter " + size + " elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.print("Enter the key element to search : ");
		int key = scan.nextInt();
		int res = LinS.linearSearch(arr, key);
		if (res == -1) {
			System.out.println(res + " Not found in this array..");
		} else {
			System.out.println("Key found in this array in " + res + " position");
		}
	}

}
