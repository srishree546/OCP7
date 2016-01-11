package com.shree.cllection;

public class ClnFirst {
	public static void main(String []args){
		ClnA obj1=new ClnA();
		ClnB obj2=new ClnB();
		obj1.set(15);
		obj2.set(15);
		ClnA obj11=new ClnA(11);
		ClnB obj12=new ClnB(11);
		System.out.println(obj1.equals(obj2));
		System.out.println(obj11.equals(obj12));
		System.out.println("hashcode for obj1 : "+obj1.hashCode());
		System.out.println("hashcode for obj2 : "+obj2.hashCode());
		System.out.println("hashcode for obj11 : "+obj11.hashCode());
		System.out.println("hashcode for obj12 : "+obj12.hashCode());
		
	}

}

class ClnA{
	int n,i;
	ClnA(){}
	ClnA(int i){
		this.i=i;
	}
	public void set(int n){
		this.n=n;
	}
	public int get(){
		return this.n;
	}
}

class ClnB{
	int m,j;
	ClnB(){}
	ClnB(int j){
		this.j=j;
	}
	public void set(int m){
		this.m=m;
	}
	public int get(){
		return this.m;
	}
}
