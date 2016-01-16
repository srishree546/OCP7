package com.shree.cllection;

import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;

public class ClsComprable {
	
	public static void main(String []args){
		ClsMap mp1=new ClsMap("Alex",10000);
		ClsMap mp2=new ClsMap("Ajay",20000);
		ClsMap mp3=new ClsMap("Joy",30000);
		ClsMap mp4=new ClsMap("Jay",40000);
		ClsMap mp5=new ClsMap("Alex",50000);
		ClsMap mp6=new ClsMap("Ajay",60000);
		ClsMap mp7=new ClsMap("Lex",70000);
		ClsMap mp8=new ClsMap("Alex",800);
		ClsMap mp9=new ClsMap("Alex",9000);
		ClsMap mp10=new ClsMap("Alex",100000);
		
		Map trm=new TreeMap();
		trm.put(mp1,mp1);
		trm.put(mp2,mp2);
		trm.put(mp3,mp3);
		trm.put(mp4,mp4);
		trm.put(mp5,mp5);
		trm.put(mp6,mp6);
		trm.put(mp7,mp7);
		trm.put(mp8,mp8);
		trm.put(mp9,mp9);
		trm.put(mp10,mp10);

		System.out.println(trm.size());
		Set key=trm.keySet();
		Iterator itr=key.iterator();
		while(itr.hasNext()){
			String s=itr.next().toString();
			System.out.println(s);
		}
	
	}
}

class ClsMap implements Comparable {
	String name;
	int salary;
	
	ClsMap(String name, int salary){
		this.name=name;
		this.salary=salary;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
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
		ClsMap other = (ClsMap) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}


	@Override
	public int compareTo(Object obj) {	
		if (this == obj)
			return 0;		
		ClsMap other = (ClsMap) obj;
		int compareTo = (-1)*name.compareTo(other.name);
		if(compareTo == 0) {
			compareTo = this.salary - other.salary;
		}
		return compareTo;
	}
	
	@Override
	public String toString() {
		return "ClsMap [name=" + name + ", salary=" + salary + "]";
	}
	
		
	
}