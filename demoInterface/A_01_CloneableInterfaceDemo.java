package demoInterface;
//The Cloneable interface is a marker interface in Java, found in the java.lang package.
//Marker Interface: It does not contain any methods. It just acts as a "tag" or "marker" to indicate that a class allows cloning of its objects using the .clone() method from Object class.

//Why is Cloneable used?
//Java's Object class provides a method called clone() which creates and returns a copy of the object.
//However, if a class does not implement Cloneable and tries to call .clone(), it will throw a CloneNotSupportedException.

//The Cloneable interface is used when:
//You want to make a copy of an object.
//You need to duplicate an object without using constructors (i.e., without creating a new object manually).

// Introduced: Java 1.0 (released in 1996
// Why so early?
// Cloning was considered an essential feature even in early Java to allow in-memory object duplication without constructors.
public class A_01_CloneableInterfaceDemo {

	static class Student implements Cloneable{
		
		int id;
		String name;
		public Student(int id , String name) {
			this.id=id;
			this.name=name;
		}
		
		public Object clone()throws CloneNotSupportedException{
			return super.clone();
		}
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student s = new Student(101,"Ram");
		Student s1 = (Student)s.clone();
		
		System.out.println(s1.name);//Ram
		System.out.println(s.name);//Ram
		//Shallow Copy: Default behavior of Object.clone() – references are copied (not deep objects).
	}
}

//What is a Shallow Copy?
//A shallow copy creates a new object, but it copies references of the fields, not the actual objects. So:
//Primitive types (like int id) are copied by value.
//Reference types (like String name) are copied by reference (though String is immutable and safe here).
//So after shallow copying:
//s and s1 are different objects.
//But s.name and s1.name refer to the same String object in memory.
