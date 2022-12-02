package com.edu;

public class DividebyZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=0,c=0;

		System.out.println("Enter Divition");
		try {
			c=a/b;

		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}

		System.out.println("After Divition "+ c);
	}

}
