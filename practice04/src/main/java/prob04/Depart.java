package prob04;

public class Depart extends Employee {
	private String department;
		
	 public Depart(String name, int salary, String department) {
		 super.setName(name);
		 super.setSalary(salary);
		 this.department = department;
	 }
	 public void getInformation() {
		System.out.println( "이름: " + super.getName() + "   연봉: " + super.getSalary()  + "   부서: " + department);
	}
}
