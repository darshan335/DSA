package com.gqt;

import java.util.Arrays;
import java.util.Scanner;

//Replace old element of an array with new element here replace only first occurence
class ReplaceArrayFirst {
	public static int[] repArrFirst(int[] arr, int oldE, int newE) {
		int count=0;
		System.out.println("Old array = " + Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == oldE&&count<1) {
				arr[i] = newE;
				count++;
			}
		}
		return arr;
	}
}

public class Assignment9a {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter " + size + " elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.print("Enter the element to remove from the array : ");
		int oldE = scan.nextInt();
		System.out.print("Enter the new element to insert : ");
		int newE = scan.nextInt();
		int[] result = ReplaceArrayFirst.repArrFirst(arr, oldE, newE);
		System.out.println("New array = " + Arrays.toString(result));
	}

}
