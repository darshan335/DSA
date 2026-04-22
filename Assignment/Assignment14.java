package com.gqt;
// Accept array elements and find sum and product also calculate time complexity
// Time complexity of this program is O(n)`
import java.util.Scanner;

class SumAndProd {
	public static void sumAndProd(int[] arr) {
		int sum = 0;
		int prod = 1;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			prod *= arr[i];
		}
		System.out.println("Sum of an array are : "+ sum);
		System.out.println("Product of an array are : "+ prod);
	}
}

public class Assignment14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter " + size + " elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		SumAndProd.sumAndProd(arr);

	}

}
