package util;

import java.util.ArrayList;

import main.SeminarApplication;

public class Seminar {

	private String _name, _number, _description, _location;
	private int _availableSeats;
	private Lecturer _lecturer;
	private ArrayList<Student> _enrollments;

	public Seminar() {
	}

	public Seminar(String title, Lecturer lecturer) {
		_name = title;
		_lecturer = lecturer;
		_enrollments = new ArrayList<>();
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		this._name = name;
	}

	public String getNumber() {
		return _number;
	}

	public void setNumber(String number) {
		this._number = number;
	}
	
	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		this._description = description;
	}
	
	public Lecturer getLecturer() {
		return _lecturer;
	}

	public void setLecturer(Lecturer _lecturer) {
		this._lecturer = _lecturer;
	}
	
	public String getLocation() {
		return _location;
	}

	public void setLocation(String location) {
		this._location = location;
	}

	public void addStudent(Student student) {
		_enrollments.add(student);
	}
	
	public void removeStudent(Student student) {
		_enrollments.remove(student);
	}
	
	public int getSeatsLeft() {
		return _availableSeats - _enrollments.size();
	}

	public ArrayList<Student> getStudentList() {
		return _enrollments;
	}
	
	public void printStudentList() {
		 for (Student student : _enrollments)
			 SeminarApplication.print(student.getFullName());
	}

}
