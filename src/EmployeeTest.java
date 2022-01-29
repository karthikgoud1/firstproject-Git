
public class EmployeeTest {

	public static void main(String[] args) {
		Employee empOne= new Employee("Ram");
		Employee empTwo = new Employee("venkat");
		
		empOne.empAge(30);
		empOne.empDesignation("Senior Software Engineer");
		empOne.empSalary(20000);
		empOne.printEmployee();
		
		
		empTwo.empAge(25);
		empTwo.empDesignation("System Engineer");
		empTwo.empSalary(10000);
		empTwo.printEmployee();
	}
}
