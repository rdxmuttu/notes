package empListCity;

import java.util.*;
import java.util.stream.Collectors;

public class EmpListMain {

	public static void main(String[] args) {
		List<EmpList> employees = new ArrayList<>();
		employees.add(new EmpList(1001, "Rohit", 32000, "Bangalore"));
		employees.add(new EmpList(1002, "Gaurav", 61000, "Chennai"));
		employees.add(new EmpList(1003, "Tushar", 52000, "Bangalore"));
		employees.add(new EmpList(1004, "Karan", 24000, "Delhi"));
		employees.add(new EmpList(1005, "Shreya", 64000, "Delhi"));
		employees.add(new EmpList(1006, "Javed", 35000, "Bangalore"));
		employees.add(new EmpList(1007, "Umesh", 71000, "Trivandrum"));
		employees.add(new EmpList(1008, "Harshita", 28000, "Bangalore"));

		printEmployeeList(employees);
		// Sorting based on salary

		List<EmpList> sortedBySalary = employees.stream()
				.sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
				.collect(Collectors.toList());
		System.out.println("\n After sorting by salary \n");
		printEmployeeList(sortedBySalary);

		// Sorting based on salary

		List<EmpList> sortedByCity = employees.stream().sorted((e1, e2) -> {
			if (e1.getCity().equalsIgnoreCase(e2.getCity())) {
				return e1.getEmployeeName().compareTo(e2.getEmployeeName());
			}
			return e1.getCity().compareTo(e2.getCity());
		}).collect(Collectors.toList());

		System.out.println("\n After sorting by city \n");
		printEmployeeList(sortedByCity);

		// Getting employees of a particular city

		String city = "Bangalore";

		List<EmpList> emps = employees.stream().filter(e -> e.getCity().equalsIgnoreCase(city))
				.collect(Collectors.toList());
		System.out.println("\n Employees belong to " + city+"\n");
		printEmployeeList(emps);

//		Map<String, Integer> cityCount = new HashMap<>();
//		employees.forEach(e->{
//			if(cityCount.containsKey(e.getCity())) {
//				cityCount.put(e.getCity(),cityCount.get(e.getCity())+1);
//			}
//			else {
//				cityCount.put(e.getCity(),1);
//			}
//		});
//		
//		System.out.println();
//		System.out.println("City\tTotal Employees");
//		cityCount.forEach((c,count)->System.out.println(c+"\t"+count));

		Map<String, Long> countByCity = employees.stream()
				.collect(Collectors.groupingBy(e -> e.getCity(), Collectors.counting()));

		countByCity.forEach((c, count) -> System.out.println("\n"+ c + "\t" + count));

	}

	public static void printEmployeeList(List<EmpList> list) {
		System.out.printf("%-10s%-20s%-10s%-20s", "ID", "Name", "Salary", "City");
		System.out.println("\n------------------------------------------------");
		list.forEach(e -> System.out.printf("%-10d%-20s%-10.2f%-20s\n", e.getEmployeeId(),
				e.getEmployeeName(),e.getSalary(), e.getCity()));
	}

}
