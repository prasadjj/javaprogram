package com.edu;

public class SwapNumberwithoutThirdVariable {

	public static void main(String[] args) {
		int a,b;
		a=30;
		b=20;
        System.out.println("Before interchanging a="+a+" and b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After interchanging a="+a+" and b="+b);
	}

}
