package com.java;

public class If_Else_if_statement {
	public static void main(String[] args) {
		int a=500;
		if (a<100) {
			System.out.println("No eletricity bill");
		}
		else if (a>100 && a<=200) {
			System.out.println("rupees 3 per unit");
		}
		else if (a>200 && a<=500) {
			System.out.println("rupees 10 per unit");
			System.out.println(a*10);
		}
		else {
			System.out.println("Rupees 5000 as charges");
		}
	}

}
