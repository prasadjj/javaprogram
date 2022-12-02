package com.edu;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0,n;
		Scanner ps=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER: ");
		n=ps.nextInt();
		for(int num=1;num<=n;num++) {
			c=0;
			for(int j=1;j<=num;j++) {
				if(num%j==0) {
					c=c+1;
				}
			}
			if(c==2)
			System.out.print(num+" ");
		}
	}

}
