package com.edu;

interface Myintface1{
	int i=9;
	void m1();
	void m2();

}

 class Product implements Myintface1 {


	public void m1() {
		System.out.println("m1()");
	}


	public void m2() {
		System.out.println("m2()");

	}
}
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product ps=new Product();
		ps.m1();
		ps.m2();

	}

}
