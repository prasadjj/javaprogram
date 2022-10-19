package com.edu;

public class LargestNumber {

	public static void main(String[] args) {
		// Largestnumber
		int a,b,c,d,e,large,l1,l2,l3;
		a=6;
		b=2;
		c=4;
		d=8;
        e=1;
        
        //Great of Two number
        
        large=(a>b)?a:b;
        System.out.println("The largest number of "+a+" and "+b+" is "+large);
        
        //Great of Three number
        
        l1=(a>b && a>c)?a:(b>a && b>c)?b:c;
        System.out.println("The largest number of "+a+" and "+b+" and "+c+" is "+l1);
        
        //Great of Four number
        
        l2=(a>b && a>c && a>d)?a:(b>a && b>c && b>d)?b:(c>a && c>b && c>d)?c:d;
        System.out.println("The largest number of "+a+" and "+b+" and "+c+" and "+d+" is "+l2);
		
        //Great of Five number     
        
        l3=(a>b && a>c && a>d && a>e)?a:(b>a && b>c && b>d && b>e)?b:(c>a && c>b && c>d && c>e)?c:(d>a && d>b && d>c && d>e)?d:e;
		System.out.println("The largest number of "+a+" and "+b+" and "+c+" and "+d+" and "+e+" is "+l3);
	}

}
