package com.shree.cllection;

import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;

public class ClsComprable {
	public static void main(String []args){
		ClsMap mp1=new ClsMap("Alex",25000);
		ClsMap mp2=new ClsMap("Ajay",250000);
		ClsMap mp3=new ClsMap("Joy",250000);
		ClsMap mp4=new ClsMap("Jay",250000);
		ClsMap mp5=new ClsMap("Alex",25000);
		ClsMap mp6=new ClsMap("Ajay",250000);
		Map trm=new TreeMap();
		trm.put(mp1,mp1);
		trm.put(mp2,mp2);
		trm.put(mp3,mp3);
		trm.put(mp4,mp4);
		trm.put(mp5,mp5);
		trm.put(mp6,mp6);

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
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		
		if (this == obj)
			return 0;
		if (obj == null)
			return 1;
		if (getClass() != obj.getClass())
			return 1;
		ClsMap other = (ClsMap) obj;
		if (name != other.name && salary != other.salary)
			return 1;
		return 0;
	}
	
	@Override
	public String toString() {
		return "ClsMap [name=" + name + ", salary=" + salary + "]";
	}
	
		
	
}