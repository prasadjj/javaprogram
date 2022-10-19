package com.edu;

public class ArithmaticOperations {

	public static void main(String[] args) {
		float num1,num2,ans;
		   num1=6;
		   num2=12;
		   
           //addition
		   ans=num1+num2;
		   System.out.println("The sum of "+num1+" and "+num2+" is "+ans);
		   
		   //diff
		   ans=num1-num2;
		   System.out.println("The difference of "+num1+" and "+num2+" is "+ans);
		    
		   //product
		   ans=num1*num2;
		   System.out.println("The Product of "+num1+" and "+num2+" is "+ans);
		   
		   //Quotient
		   ans=num1/num2;
		   System.out.println("The quotient of "+num1+" and "+num2+" is "+ans);
		   
		   //Remainder
		   ans=num1%num2;
		   System.out.println("The Remainder of "+num1+" and "+num2+" is "+ans);
	} 
}
