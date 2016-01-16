package com.shree.cllection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ClsLList {
	public static void main(String []args) {
		List<Integer> ll=new LinkedList<Integer>();
		ll.add(11);
		ll.add(150000);
		ll.add(11);
		ll.add(150000);
		ll.add(110000);
		ll.add(15);
	System.out.println(ll.size());	
	Iterator<Integer> itr=ll.iterator();
	while(itr.hasNext()){
		Integer i=itr.next();
		System.out.println(i);
	}

	}
}

