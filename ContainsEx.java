package com.edu;

public class ContainsEx {

	public static void main(String[] args) {
		String s="Hello Hi how are you";
		String st="Hi";
				System.out.println("Hi is there or not="+s.contains(st));		
				System.out.println("Position of e (left or right) ="+s.indexOf('e'));
				System.out.println("lastIndexOf (left or right)="+s.lastIndexOf('e'));
				
				//Replace
				
				System.out.println("Replace e with a "+s.replace('e','a'));
				System.out.println("Replace you with we "+s.replace("you","we"));
				
				//Reverse,Append
				
				StringBuffer sn=new StringBuffer(s);
				StringBuilder sn1=new StringBuilder(s);
				System.out.println(sn.reverse());
				System.out.println(sn1.append("edu bridge"));
	}

}
