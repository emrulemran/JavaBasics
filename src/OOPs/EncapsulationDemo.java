package oops.demo;

public class EncapsulationDemo {

	private int ssn;
	private String empName;
	private int empAge;

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public static void main(String[] args) {

		EncapsulationDemo ed = new EncapsulationDemo();
		ed.setEmpAge(34);
		ed.setEmpName("Ameer");
		ed.setSsn(123456);

		System.out.println("The name of the employee is : " + ed.getEmpName());
		System.out.println("The age of the employee is : " + ed.getEmpAge());
		System.out.println("The ssn of the employee is : " + ed.getSsn());

	}

}
