package com.shree.cllection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ClsComptor {
	
	static class Company {
	    
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
		public String toString() {
			return "Company [num_of_employess=" + num_of_employess + ", name="
					+ name + "]";
		}		
	    
	    
	}

	public static Comparator byNameComparator = new Comparator<Company>() {

		@Override
		public int compare(Company o1, Company o2) {
			return o1.name.compareTo(o2.name);
		}
	};
	
	public static Comparator byNoOfEmployeesComparator = new Comparator<Company>() {
		@Override
		public int compare(Company o1, Company o2) {
			return o1.num_of_employess - o2.num_of_employess;
		}
	};
	
	
	public static void main(String[] args) {
        Company comp1 = new Company("Company1", 20);
        Company comp2 = new Company("Company2", 15);
        Company comp3 = new Company("Company3", 20);
        Company comp4 = new Company("Company4", 15);
        List<Company> companies = new ArrayList<Company>();
        companies.add(comp1);
        companies.add(comp2);
        companies.add(comp3);
        companies.add(comp4); 
        System.out.println("Sorting by name");
        Collections.sort(companies,byNameComparator);
        print(companies);
        
        System.out.println("Sorting by no of employees");
        Collections.sort(companies,byNoOfEmployeesComparator);
        print(companies);
       
	}


	private static void print(List<Company> companies) {
		for(Company comp : companies) {
			System.out.println(comp);
		}
	}
}

