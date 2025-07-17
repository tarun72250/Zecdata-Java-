package sorting;

import java.util.Arrays;
import java.util.Comparator;

//Custom Sorting with Comparator
//https://www.geeksforgeeks.org/arrays-sort-in-java/

class Student 
{
	int rollNo;
	String name;
	
	public Student(int r, String n) {
		this.rollNo=r;
		this.name=n;
	}
	
	public String toString() {
		return this.rollNo+ " "+this.name;
	}
}

class SortByRoll implements Comparator<Student>
{
	public int compare(Student o1, Student o2) {
		return o1.rollNo - o2.rollNo;
	}
}

class A_02_SortByComparater {

	public static void main(String[] args) {
		Student st [] = {new Student(103,"Aman"),
				new Student(102,"Jay"),
				new Student(101,"Ram"),
				new Student(106,"Gambhir"),
				new Student(102,"Prem"),
				new Student(104,"Rohan")};
		
		Arrays.sort(st , new SortByRoll());
		for(int i=0;i<st.length;i++) {
			System.out.println(st[i]);
		}
		//System.out.println(Arrays.toString(st));
	}
}
