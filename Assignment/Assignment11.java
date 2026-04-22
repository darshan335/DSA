package com.gqt;

import java.util.Arrays;
import java.util.Scanner;

//Find the second largest and second smallest elements present in an array
class SecondLS {
	public static void secondLS(int[] arr) {
		Arrays.sort(arr);
		System.out.println("Second smallest element in an array is : " + arr[1]);
		System.out.println("Second  element in an array is : " + arr[arr.length - 2]);
	}
}

public class Assignment11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter " + size + " elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		SecondLS.secondLS(arr);
	}

}
