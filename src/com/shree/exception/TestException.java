package com.shree.exception;

public class TestException {
	public static void main(String []args) {
		int x=0;
		int y=12,z=0;
		try{
		z=y/x;
		}catch(ArithmeticException e)
		{}
		System.out.println(z);
	}

}
