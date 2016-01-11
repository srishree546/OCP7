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
			System.out.println(obj.size());
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClass other = (MyClass) obj;
		if (num != other.num)
			return false;
		return true;
	}
/*
	@Override
	public String toString() {
		return "MyClass [num=" + num + "]";
	}
*/	
}
