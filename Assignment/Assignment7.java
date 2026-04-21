package com.gqt;

import java.util.Scanner;

// Find the factorial of 2nd even number present in an array
class FactorialOfSecondEven {
	public static int factOfSecondEven(int[] arr) {
		int factors = 0;
		int sec = 0;
		int fact=1;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				factors++;
				if (factors == 2) {
					sec = arr[i];

				}
			}

		}
		for(int j =1; j<=sec;j++) {
			fact*=j;
		}
		
		return fact;

	}
}

public class Assignment7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter " + size + " elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		int result = FactorialOfSecondEven.factOfSecondEven(arr);
		System.out.println("Factorial of 2nd even number is : " + result);
	}

}
