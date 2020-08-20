package util;

public class Lecturer extends Person {

	private int _salary;

	public Lecturer(String name, String surname, int salary) {
		super(name, surname);
		_salary = salary;
	}
	
	public int getSalary() {
		return _salary;
	}

	public void setSalary(int salary) {
		this._salary = salary;
	}
	
	@Override
	public String getFullName() {
		return super.getFullName() + " Salary: " + _salary;
	}
}
