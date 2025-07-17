package demoInterface;
//A Deep Copy in Java means creating a fully independent clone of an object — including all the nested or referenced objects.
//It duplicates not just the object itself, but everything inside it, recursively.
class Address implements Cloneable {
    String city;
    String state;

    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    // Clone method for Address
    public Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }
}

public class A_02_DeepCopyDemo {

	static class Employee implements Cloneable {
	    int id;
	    String name;
	    Address address;

	    Employee(int id, String name, Address address) {
	        this.id = id;
	        this.name = name;
	        this.address = address;
	    }

	    // Deep copy: clone Employee and its Address too
	    public Employee clone() throws CloneNotSupportedException {
	        Employee cloned = (Employee) super.clone();
	        cloned.address = address.clone(); // deep copy of Address , so both address : Bhopal
	        return cloned;
	    }
	}
	
	
	 public static void main(String[] args) throws CloneNotSupportedException {
	        Address addr1 = new Address("Indore", "MP");
	        Employee emp1 = new Employee(101, "Tarun", addr1);

	        // Deep clone
	        Employee emp2 = emp1.clone();

	        // Modify original address
	        emp1.address.city = "Bhopal";

	        // Output both cities
	        System.out.println("Original Employee City: " + emp1.address.city);  // Bhopal
	        System.out.println("Cloned Employee City:   " + emp2.address.city);  // Indore
	    }
}



