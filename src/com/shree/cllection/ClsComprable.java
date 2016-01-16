package com.shree.cllection;

import java.util.Map;
import java.util.TreeMap;

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
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
		
	
}