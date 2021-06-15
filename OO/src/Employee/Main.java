package Employee;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee("Carlos", 6000, 1000);
		Employee emp2 = new Employee("Sofia", 10000, 2300);
		
		System.out.println(emp);
		System.out.println(emp2);
		
		emp.IncreaseSalary(10);
		System.out.println(emp);
		
		emp2.IncreaseSalary(25);
		System.out.println(emp2.Salary);
	}

}
