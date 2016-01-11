package com.shree.cllection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyClass{
	int num;
	
	MyClass(int num){
	this.num=num;
	}
	public static void main(String []args) {
		MyClass a1=new MyClass(1);
		MyClass a2=new MyClass(11);
		MyClass a3=new MyClass(12);
		MyClass a4=new MyClass(1);
		MyClass a5=new MyClass(11);
		
		Set obj=new HashSet();
		obj.add(a1);
		obj.add(a2);
		obj.add(a3);
		obj.add(a4);
		obj.add(a5);
		
		Iterator it=obj.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
