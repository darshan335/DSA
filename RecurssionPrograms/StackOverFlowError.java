package com.gqt;

class Rec {
	public static void m1() {
		System.out.println("Hi hello bye");
		m1();
	}
}

public class StackOverFlowError {

	public static void main(String[] args) {
		Rec.m1();
	}

}
