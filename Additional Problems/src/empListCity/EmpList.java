package empListCity;

public class EmpList {
	
		private int employeeId;
		private String employeeName;
		private double salary;
		private String city;
	

	


	public int getEmployeeId() {
			return employeeId;
		}


		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}


		public String getEmployeeName() {
			return employeeName;
		}


		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}


		public double getSalary() {
			return salary;
		}


		public void setSalary(double salary) {
			this.salary = salary;
		}


		public String getCity() {
			return city;
		}


		public void setCity(String city) {
			this.city = city;
		}


	


	public EmpList(int employeeId, String employeeName, double salary, String city) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.city = city;
	}

}
