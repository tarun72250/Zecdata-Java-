package streamsAPI;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class A_01_EmployeeDemo {

public static void main(String[] args) {
		
		List<A_01_Employee> empList = A_01_Employee.getEmpList();
		//Filter Method
	    //We will filter the employees list with gender as Female
			System.out.println("\n--------------------Filter with gender as Female----------------------");
			empList.stream().
			filter(e-> e.getGender().equals("Female")).
			forEach(e -> System.out.println(e));
		
			//We will filter the employees list with newJoiner as True
			System.out.println("\n-----------Filter with newJoiner as True-----------");
			empList.stream().
			filter(e -> e.getNewJoiner().equalsIgnoreCase("true")).
			forEach(e -> System.out.println(e));
			
			//Sort Method
			//We will sort the employee list by rating asc.
			System.out.println("\n-----------Sort Method by list by rating asc-----------");
			empList.stream().
			sorted(Comparator.comparing(A_01_Employee::getRating)).
			forEach(e->System.out.println(e));
			
			//We will sort the employee list by rating desc.
			System.out.println("\n--------------------Sort Method by list by rating desc----------------------");
			empList.stream().
			sorted(Comparator.comparing(A_01_Employee::getRating).reversed()).
			forEach(e->System.out.println(e));
			
			//We will sort the employee list by both rating and salary
			System.out.println("\n-----------Sort Method by both rating and salary-----------");
			empList.stream().
			sorted(Comparator.comparing(A_01_Employee::getRating)).
			sorted(Comparator.comparing(A_01_Employee::getSalary)).
			forEach(e->System.out.println(e));
			
			//Match Method
			//We will see all employees with salary more than 1000
			System.out.println("\n-----------Match Method by all employees with salary more than 1000-----------");
			boolean isSalary = empList.stream().
			allMatch(e -> e.getSalary() > 1000);
			System.out.println(isSalary);
			
			empList.stream()
	        .filter(e -> e.getSalary() > 1000)
	        .forEach(System.out::println);
			
			//Max Function
			//We will retrieve employee with max salary
			System.out.println("\n-----------Max Method for retrieve employee with max salary-----------");
			empList.stream().
			max(Comparator.comparing(A_01_Employee::getSalary)).
			ifPresent(System.out::println);
			
			//We will retrieve employee with max rating
			System.out.println("\n-----------Max Method for retrieve employee with max rating-----------");
			empList.stream().
			max(Comparator.comparing(A_01_Employee::getRating)).
			ifPresent(System.out::println);
			
			//Min Function
			//We will retrieve employee with min salary
			System.out.println("\n-----------Min Method for retrieve employee with min salary-----------");
			empList.stream().
			min(Comparator.comparing(A_01_Employee::getSalary)).
			ifPresent(System.out::println);
			
			//We will retrieve employee with min rating
			System.out.println("\n-----------Min Method for retrieve employee with min rating-----------");
			empList.stream().
			min(Comparator.comparing(A_01_Employee::getRating)).
			ifPresent(System.out::println);
			
			//GroupBy Function
			//We will group all our employees by Gender
			System.out.println("\n-----------GroupBy Method for group all our employees by Gender-----------");
			Map<String ,List<A_01_Employee>> empByGender = empList.stream().
			collect(Collectors.groupingBy(A_01_Employee::getGender));
			
			empByGender.forEach(((g,e)->{
				System.out.println(g);
				e.forEach(System.out::println);
			}));
			
			
	}
}
