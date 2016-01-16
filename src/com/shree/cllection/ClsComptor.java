package com.shree.cllection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ClsComptor {
	public static void main(String[] args) {
        Company comp1 = new Company("Company1", 20);
        Company comp2 = new Company("Company2", 15);
        Company comp3 = new Company("Company3", 20);
        Company comp4 = new Company("Company4", 15);
        Map mp=new TreeMap();
        mp.put(comp1, comp1);
        mp.put(comp2, comp2);
        mp.put(comp3, comp3);
        mp.put(comp4, comp4);
        System.out.println(mp.size());
        Set keys=mp.keySet();
        Iterator itr=keys.iterator();
        while(itr.hasNext()){
        	System.out.println(itr.next());
        }
	}
}
class Company implements Comparator {
    private int num_of_employess;
    private String name;
    public Company(String name, int num_of_employess) {
        this.name = name;
        this.num_of_employess = num_of_employess;
    }
    
	public int getNumOfEmployess() {
        return this.num_of_employess;
    }
    public String getName() {
        return this.name;
    }
	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		Company comp1=(Company)obj1;
		Company comp2=(Company)obj2;
		if(comp1.getNumOfEmployess()== comp2.getNumOfEmployess())
	            return 0;
			else
			return comp1.getNumOfEmployess() > comp2.getNumOfEmployess() ? 1 : -1;
	}
}

