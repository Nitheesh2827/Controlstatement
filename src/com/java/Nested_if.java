package com.java;

public class Nested_if {
	public static void main(String[] args) {
		int b=40,c=100;
		if (b<c) {
			System.out.println("True");
			if (b==50) {
				System.out.println("B is 40");
			}
			else {
				System.out.println("Wrong statement");
			}
		}
		else {
			System.out.println("False");
		}
	}

}
