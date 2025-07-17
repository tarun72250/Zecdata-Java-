package demoInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//1. implements Comparable<T>
class Student implements Comparable<Student> {
	
	int id;
	String name;
	
	public Student(int id , String name) {
		this.id=id;
		this.name=name;
	}
	
	//2. override compareTo()
	public int compareTo(Student s) {
		return this.id - s.id;//sort by id ascending order
	}
}

public class A_07_ComparableDemo {

	public static void main(String[] args) {
		List<Student>  list = new ArrayList<Student>();
		list.add(new Student(103,"Harish"));
		list.add(new Student(106,"Carish"));
		list.add(new Student(101,"Parish"));
		list.add(new Student(102,"Rarish"));
		list.add(new Student(109,"Warish"));
		
		//Call Collections.sort(list); and passed Student list to it
		Collections.sort(list);
		
		for(Student s : list) {
			System.out.println(s.id+" "+s.name);
		}
		
	}
}
