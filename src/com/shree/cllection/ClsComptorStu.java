package com.shree.cllection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Student {
	    
		private int id;
	    private String name;
	    private int score;
	    private String result;
	    public Student(int id, String name, int score, String result) {
	        this.id=id;
	    	this.name = name;
	        this.score = score;
	        this.result = result; 
	    }
	    public int getId() {
			return this.id;
		}
		public String getName() {
	        return this.name;
	    }
	    public int getScore() {
			return this.score;
		}
		public String getResult() {
			return this.result;
		}

		@Override
			public String toString() {
				return "Student [id=" + id + ", name=" + name + ", score=" + score + ", result=" + result + "]";
			}

		public static Comparator byIdComparator = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.id-o2.id;
			}
		};

		public static Comparator byNameComparator = new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.name.compareTo(o2.name);
		}
	};
	
	public static Comparator byScoreComparator = new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.score-o2.score;
		}
	};

	public static Comparator byResultComparator = new Comparator<Student>() {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.result.compareTo(o2.result);
		}
	};
	
	public static void print(List<Student> students) {
		for(Student stu : students) {
			System.out.println(stu);
		}
	}	
}	
public class ClsComptorStu {
	public static void main(String[] args) {
		Student stu1=new Student(11,"Ankita",99,"A");
		Student stu2=new Student(5,"Anita",49,"D");
		Student stu3=new Student(15,"Anvita",59,"C");
		Student stu4=new Student(10,"Asrita",79,"B");
		Student stu5=new Student(12,"Arpita",29,"E");
		Student stu6=new Student(1,"Aditi",69,"B");
		

		List<Student> students = new ArrayList<Student>();
		students.add(stu1);
		students.add(stu2);
		students.add(stu3);
		students.add(stu4);
		students.add(stu5);
		students.add(stu6);

        System.out.println("Sorting by id");
        Collections.sort(students,Student.byIdComparator);
        Student.print(students);

		System.out.println("Sorting by name");
        Collections.sort(students,Student.byNameComparator);
        Student.print(students);
        
        System.out.println("Sorting by score");
        Collections.sort(students,Student.byScoreComparator);
        Student.print(students);

        System.out.println("Sorting by result");
        Collections.sort(students,Student.byResultComparator);
        Student.print(students);
       
	}
}

