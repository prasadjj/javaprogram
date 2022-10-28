package com.edu;

public class NonPrimitiveString {

	public static void main(String[] args) {
	    String name1="Praveen";
	    String name2="Kumar";
	    
	    //No of characters
	    int S=name1.length();
	    System.out.println("No of character="+S);
	     System.out.println("First character="+name1.charAt(0));
	     System.out.println("Last character="+name1.charAt(6));
	     String sn=name1+" "+name2;
	     System.out.println("Full name="+sn);
	     System.out.println("Lowercase="+name1.toLowerCase());
	     System.out.println("Uppercase="+name1.toUpperCase());
	     
	     //Substring
	     System.out.println("Substring (2,4)"+name1.substring (2,6));
	     System.out.println("Substring (2,4)"+name2.substring (2,4));
	}

}
