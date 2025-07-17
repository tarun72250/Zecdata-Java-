package demoInterface;

class Address1 implements Cloneable {
    String city;
 

    Address1(String city) {
        this.city = city;
    }
}


public class A_03_ShallowCopyDemo {
	 static class Employee implements Cloneable {
		    int id;
		    String name;
		    Address1 address1;

		    Employee(int id, String name, Address1 address1) {
		        this.id = id;
		        this.name = name;
		        this.address1 = address1;
		    }

		    // Shallow copy
		    public Employee clone() throws CloneNotSupportedException {
		        return (Employee) super.clone();  // Only top-level object is cloned
		    }
		}
	 public static void main(String[] args) throws CloneNotSupportedException {
	        Address1 addr = new Address1("Indore");
	        Employee e1 = new Employee(101, "Tarun", addr);
	        Employee e2 = e1.clone();

	        e1.address1.city = "Bhopal";

	        System.out.println("Original City: " + e1.address1.city);  // Bhopal
	        System.out.println("Cloned City:   " + e2.address1.city);  // Bhopal (same reference)
	    }
}

