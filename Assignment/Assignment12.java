package com.gqt;

import java.util.Arrays;
import java.util.Scanner;

//Find the Max and Min elements present in an array
class SecondLSE {
	public static void secondLSE(int[] arr) {
		Arrays.sort(arr);
		System.out.println("Min element in an array is : " + arr[0]);
		System.out.println("Max element in an array is : " + arr[arr.length - 1]);
	}
}

public class Assignment12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter " + size + " elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		SecondLSE.secondLSE(arr);
	}

}
