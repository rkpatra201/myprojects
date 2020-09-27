package com.activity1;

public class test {
	 static int a;
	 static int b;
	 //static block1
	 static {
	    a = 10;
	    b = 20;
	 }
	 //static block2
	 static
	 {
	 System.out.println("Im in static block");
		 
	 }
	 public static void main(String args[]) {
	 System.out.println("I m in main method");	  
	  System.out.println("Value of a = " + a);
	  System.out.println("Value of b = " + b);
      test var=new test();
	 	}
	}