

public class Employee {
	public int id;
	public String name;
	public double salary;
	public String designation;
	public String insuranceScheme;
	Employee e;
	services s;
	public Employee() {
		super();
	}

	public Employee(int id, String name, double salary, String designation, String insuranceScheme) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.insuranceScheme = insuranceScheme;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getInsuranceScheme() {
		return insuranceScheme;
	}

	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
//	public void findService() {
//		if(e.getSalary() >= 50000 && e.getDesignation().equals("Senior Analyst") ) {
//			s.homeloan();
//			s.pf();
//		}
//		else if(e.getSalary() >= 30000 || e.getDesignation().equals("Analyst")) {
//			s.pf();
//		}
//	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", insuranceScheme=" + insuranceScheme + "]";
	}
	
}