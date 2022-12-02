package com.edu;

class Student{
    private int sid;
    private String sname;
    public Student() {
    	System.out.println("Constructor Make Access Specifier public because");
    	System.out.println("We Need To Create An Object");
    }

    public void display() {
    	System.out.println("Student ID: "+sid);
    	System.out.println("Student Name: "+sname);
    }
}
public class AccessSpecifiersmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ps=new Student();
		ps.display();
	}

}
