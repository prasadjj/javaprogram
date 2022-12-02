package com.edu;

class Employee{
	public void display() {
		System.out.println("Display method of employeee");
	}
}
class Hrempolyee extends Employee{
	public void display() {
		System.out.println("Dispaly method of hremployee");
		super.display();
	}
}
public class Overrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hrempolyee ps= new Hrempolyee();
		ps.display();
	}

}
