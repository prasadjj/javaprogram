package com.edu;

public class SwapNumberInTemp {

	public static void main(String[] args) {
		int a,b,temp;
		a=10;
		b=20;
        System.out.println("Before swapping of a="+a+" and b="+b);
        
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping of a="+a+" and b="+b);
        
        temp=a-b;
        a=a-b;
        b=temp-a;
        System.out.println("Enter the swapping a="+a+" and b="+b);
	}

}
