package com.edu;
import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
	String name;
	int age;
	float fee;
	char gen;
	
	Scanner sc=new Scanner(System.in);
	
	//User input
	
	System.out.println("Enter the name");
	name=sc.nextLine();
	System.out.println("Enter the age");
	age=sc.nextInt();
	System.out.println("Enter the gen");
	gen=sc.next();//charAt(0);
	System.out.println("Enter the fee");
	fee=sc.nextFloat();
	
	//Display

	System.out.println("name="+name);
	System.out.println("age="+age);
	System.out.println("fee="+fee);
	System.out.println("gen="+gen);
	}

}
