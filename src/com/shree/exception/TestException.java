package com.shree.exception;

public class TestException {
	
	public static void main(String []args) {
		int x=0;
		int y=12;
		int z=TestException.division(x,y);
		System.out.println(z);
	}

	public static int division(int x,int y){
		int z = 0;
		try{
			z=y/x;
			}catch(ArithmeticException e)
			{}
		return z;			
	}
}
