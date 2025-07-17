package demoInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1{

	int id;
	String name;
	
	public Student1(int id, String name) {
		this.id=id;
		this.name=name;
	}
}

class NameComparator implements Comparator<Student1>
{
	public int compare(Student1 s , Student1 s1) {
		return s.name.compareTo(s1.name);
	}
}

public class A_08_ComparatorDemo {

	public static void main(String[] args) {
		
		List<Student1> list = new ArrayList<>();
		list.add(new Student1(104,"H"));
		list.add(new Student1(106,"V"));
		list.add(new Student1(103,"A"));
		list.add(new Student1(101,"E"));
		list.add(new Student1(108,"C"));
		
		Collections.sort(list,new NameComparator());
		
		for(Student1 s : list) {
			System.out.println(s.id+" "+s.name);
		}
		
	}
}
