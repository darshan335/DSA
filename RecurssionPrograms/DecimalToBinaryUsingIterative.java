package com.gqt;

import java.util.ArrayList;
import java.util.Scanner;

class DtoB {
	public static void dToB(int n) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		int r =0;
		while(n>0) {
			r=n%2;
			al.add(r);
			n/=2;
		}
		System.out.print("Binary number of "+n+" is : ");
		for(int i=al.size()-1;i>=0;i--) {
			System.out.print(al.get(i)+" ");
		}
		
	}
}

public class DecimalToBinaryUsingIterative {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n=scan.nextInt();
		DtoB.dToB(n);
		
	}

}
