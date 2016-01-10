package com.shree.exception;

public class TestException {
	static int z;
	public static void main(String []args) {
		int x=0;
		int y=12;
		z=TestException.division(x,y);
		System.out.println(z);
	}

	public static int division(int x,int y){
		try{
			z=y/x;
			}catch(ArithmeticException e)
			{}
		return z;
			
	}
}
