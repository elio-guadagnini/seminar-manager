package main;

public class Course {

	private String _name, _number, _description;
	
	public Course(String name, String number, String description) {
		_name = name;
		_number = number;
		_description = description;
	}

	public String getName() {
		return _name;
	}

	public void setName(String _name) {
		this._name = _name;
	}

	public String getNumber() {
		return _number;
	}

	public void setNumber(String _number) {
		this._number = _number;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String _description) {
		this._description = _description;
	}
	
}
