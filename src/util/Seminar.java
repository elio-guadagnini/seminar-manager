package util;

import java.util.ArrayList;

import main.SeminarApplication;

public class Seminar {

	private String _name, _number, _description, _location;
	private int _availableSeats;
	private Lecturer _lecturer;
<<<<<<< new-master-branch
	private ArrayList<Student> _enrolledStudents;
=======
	private ArrayList<Enrollment> _enrollments;
>>>>>>> local

	public Seminar() {
	}

	public Seminar(String title, Lecturer lecturer) {
		_name = title;
		_lecturer = lecturer;
		_enrolledStudents = new ArrayList<>();
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

<<<<<<< new-master-branch
	public void addStudent(Student student) {
		_enrolledStudents.add(student);
	}
	
	public void removeStudent(Student student) {
		_enrolledStudents.remove(student);
=======
	public void addEnrollment(Enrollment enrollment) {
		_enrollments.add(enrollment);
	}
	
	public void removeEnrollment(Enrollment enrollment) {
		_enrollments.remove(enrollment);
>>>>>>> local
	}
	
	public int getSeatsLeft() {
		return _availableSeats - _enrolledStudents.size();
	}

<<<<<<< new-master-branch
	public ArrayList<Student> getStudentList() {
		return _enrolledStudents;
	}
	
	public void printStudentList() {
		 for (Student student : _enrolledStudents)
			 SeminarApplication.print(student.getFullName());
=======
	public ArrayList<String> getStudentList() {
		ArrayList<String> students = new ArrayList<>();
		for (Enrollment enrollment : _enrollments) {
			students.add(enrollment.getStudent().getFullName());
		}
		
		return students;
	}
	
	public void printStudentList() {
		 for (Enrollment enrollment : _enrollments)
			 SeminarApplication.print(enrollment.getStudent().getFullName());
>>>>>>> local
	}

}
