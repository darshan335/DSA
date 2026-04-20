package com.gqt;

import java.util.Arrays;
import java.util.Scanner;

class RepArr {
	public static void arrRep(int[] arr, int oldE, int newE) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == oldE) {
				arr[i] = newE;
			}
		}

	}
}

public class ReplaceArrayElem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter " + size + " elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.print("Enter array element to remove : ");
		int oldE = scan.nextInt();
		System.out.print("Enter array element to be inserted : ");
		int newE = scan.nextInt();
		RepArr.arrRep(arr, oldE, newE);
		System.out.println("Result = " + Arrays.toString(arr));

	}

}
