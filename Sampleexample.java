package com.edu;

public class Sampleexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,space=10,k;
		for (i=1;i<=5;i++) {
			for(k=0;k<space;k++) {
				System.out.println(" ");
			}
			for(j=0;j<2*i-1;j++) {
				System.out.println("*");
			}
			space--;
			System.out.println("");
		}
	}

}
