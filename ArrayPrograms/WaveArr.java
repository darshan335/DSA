package com.gqt;

import java.util.Scanner;

class SAA {
	public static int[] sortArr(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}

		}
		return arr;
	}
}

public class WaveArr {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter " + size + " elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		int[] res = SAA.sortArr(arr);
		System.out.print("Array wave form : "+ arr[0]+" ");
		for (int i = 1; i <arr.length-1; i += 2) {
			int temp = arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;

			System.out.print(arr[i] + " " + arr[i+1] + " ");

		}

	}

}
