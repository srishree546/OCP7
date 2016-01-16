package com.shree.thred;
/*
class MyThread extends Thread {
	//private int count;
//	private volatile int volt;
	//count=0;
	//volt=0;
	public void run()
	{
		for(int i=0;i<10;i++){		
		System.out.println("count :");//+count);
	//	System.out.println("volt :"+volt);
		//count++;
	//	volt++;
		}
	
}
*/
class MyT extends Thread {
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println(Thread.currentThread().getName() + " count :"+i);
		}
	}
}
public class ClsThred {
	public volatile int volt=0;
	public int count=0;
	public static void main(String args[]) {
		MyT obj1=new MyT();
		obj1.start();
		
		MyT obj2=new MyT();
		obj2.start();
		
	}

}
