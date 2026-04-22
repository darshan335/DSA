package com.gqt;

// Accept any string and sort in ascending order
import java.util.Arrays;

// Accept any string and sort in ascending order
import java.util.Scanner;

class StringSort {
	public static void stringSort(char[] ch) {
		System.out.println(ch);
	}
}

public class Assignment13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any string : ");
		String s = scan.nextLine();
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		StringSort.stringSort(ch);

	}

}
