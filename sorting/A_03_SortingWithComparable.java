package sorting;

import java.util.Arrays;

class Student1 implements Comparable<Student1>{
	int rollNo;
	String name;
	
	public Student1(int rollNo,String name) {
		this.rollNo=rollNo;
		this.name=name;
	}

	@Override
	public int compareTo(Student1 o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
	public String toString() {
		return this.rollNo +" "+this.name;
	}
	
}

public class A_03_SortingWithComparable {

	public static void main(String[] args) {
		
		Student1 st [] = {new Student1(108,"Rahul"),
				new Student1(102,"Pahul"),
				new Student1(105,"Bahul"),
				new Student1(104,"Aahul")};
		
		Arrays.sort(st);
		for(Student1 s : st) {
			System.out.println(s);
		}
		
	}
}
