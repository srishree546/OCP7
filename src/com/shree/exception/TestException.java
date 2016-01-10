package com.shree.exception;
/**
 * 
 * @author
 */
public class TestException {
	
	public static void main(String []args) {
		int x=0;
		int y=12;
		if(x>0) {
		int z=TestException.division(x,y);
		System.out.println(z);
		}
		
	}

	// method for diving 2 numbers
	public static int division(int x,int y){
			return y/x;			
	}
}
