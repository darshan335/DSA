package com.gqt;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//Replace old element of an array with new element
class ReplaceArray {
	public static int[] repArr(int[] arr, int oldE, int newE) {
		System.out.println("Old array = " + Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == oldE) {
				arr[i] = newE;
			}
		}
		return arr;
	}
}

public class Assignment9 {

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
		int[] result = ReplaceArray.repArr(arr, oldE, newE);
		System.out.println("New array = " + Arrays.toString(result));
	}

}
