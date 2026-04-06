package com.gqt;

import java.util.Scanner;

//Eg.1 Accept any number from the user print only last digit amd print number except last digit
class Demo {
	public static void printLastDigit(int n) {
		System.out.println("Last Digit = " + (n % 10));
		System.out.println("Number except Last Digit =  " + (n / 10));
	}
}

public class PrintingLastDigitAndExceptLastDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Number : ");
		int n = sc.nextInt();
		Demo.printLastDigit(n);
	}

}
