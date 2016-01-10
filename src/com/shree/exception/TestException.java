package com.shree.exception;

public class TestException {
	static int z;
	public static void main(String []args) {
		int x=0;
		int y=12;
		TestE obj=new TestE();
		z=obj.division(x,y);
		System.out.println(z);
	}
}

class TestE {
	int z;
	public int division(int x,int y){
		try{
			z=y/x;
			}catch(ArithmeticException e)
			{		
				System.out.println("division by zero not allowed "+e);
			}
		return z;			
	}
}
