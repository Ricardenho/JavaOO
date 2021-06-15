package Employee;

public class Employee {
	String Name;
	double Salary;
	double Tax;
	
	
	public Employee(String name, double salary, double tax) {
		super();
		Name = name;
		Salary = salary;
		Tax = tax;
	}

	
	@Override
	public String toString() {
		return "Employee: " + Name + ", R$" + NetSalary();
	}


	public void IncreaseSalary(double percentage) {
		Salary = Salary + (Salary*(percentage/100));
	}
	
	public double NetSalary() {
		return Salary-Tax;
	}
}
