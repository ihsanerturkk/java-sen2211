
public class Employee {
	
	private String name;
	private int ID;
	private double salary;
	
	public Employee () {
		name = "Ali";
		ID = 1234;
		salary = 1000;
	}
	
	public Employee(String name, int iD, double salary) {
		this.name = name;
		ID = iD;
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		System.out.println(emp1.getName());
		emp1.setName("Can");
		System.out.println(emp1.getName());
		
		Employee emp2 = new Employee("Ayþe", 999, 666);
		System.out.println(emp2.getSalary());
		
	}

	//public return_type function_name (parameters)
	
	public int getID () {
		return ID;
	}
	
	public void setID (int ID) {
		this.ID = ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
