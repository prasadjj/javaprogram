package com.edu;

public class Employee {
 int b;//instance variable
 static int c=10;//static variable
     
     void display() {
    	int k;//local
    	System.out.println("b="+b);//default value is zero
    	System.out.println("static data c="+c);
     }
	public static void main(String[] args) {
		//
        int a=10;//a is called local variable
        Employee eob=new Employee();//creating an object
        System.out.println("b="+eob.b);//default value is zero
        System.out.println("static data c="+Employee.c);
        System.out.println("static data c="+eob.c);
        System.out.println("static data c="+c);
	}

}
