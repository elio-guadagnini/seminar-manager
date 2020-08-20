package util;

public class Student extends Person {
	
	private String _type;
	
	public Student(String name, String surname, String type) {
		super(name, surname);
		_type = type;
	}

	public String getStudentId() {
		return _type;
	}

	public void setStudentId(String type) {
		this._type = type;
	}
	
	@Override
	public String getFullName() {
		return super.getFullName() + " Type: " + _type;
	}
	
	@Override
	public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + ((super.getName() == null) ? 0 : super.getName().hashCode());
	    result = prime * result + ((super.getSurname() == null) ? 0 : super.getSurname().hashCode());
	    result = prime * result + ((_type == null) ? 0 : _type.hashCode());
	    return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		return hashCode() == obj.hashCode();
	}
	
}
