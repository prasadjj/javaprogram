package com.edu;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
	   System.out.println("What is your name");
	   String name=sc.nextLine();
	   System.out.println("What is your age");
	   int age=sc.nextInt();	
	   System.out.println("hello"+ name);
	   System.out.println("your age"+age);
	}

}
