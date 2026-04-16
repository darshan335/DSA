package com.gqt;

import java.util.Scanner;

class Adj {
	public static String newString(String s,char ch,int i) {
		if(i==0) {
			return s.charAt(i)+" ";
		}else {
			return newString(s, ch, i-1)+ch+s.charAt(i);
		}
	}
}

public class Adjacent {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter String : ");
		String s = scan.nextLine();
		System.out.print("Enter the character to add : ");
		char ch = scan.next().charAt(0);
		String result = Adj.newString(s, ch, s.length() - 1);
		System.out.println("String after removing '" + ch + "' = " + result);
	}

}
