package util;

import java.util.ArrayList;

import main.Course;
import main.SeminarApplication;

public class Seminar {

	private String _location;
	private int _availableSeats;
	private Course _course;
	private ArrayList<Enrollment> _enrollments;

	public Seminar() {
	}

	public Seminar(Course course, String location, int availableSeats) {
		_course = course;
		_location = location;
		_availableSeats = availableSeats;
		_enrollments = new ArrayList<>();
	}

	public String getName() {
		return _course.getName()+" "+_course.getNumber();
	}

	public void setName(String name) {
		_course.setName(name);
	}

	public String getDescription() {
		return _course.getDescription();
	}

	public void setDescription(String description) {
		_course.setDescription(description);;
	}
	
	public String getLocation() {
		return _location;
	}

	public void setLocation(String location) {
		this._location = location;
	}

	public int getSeatsLeft() {
		return _availableSeats - _enrollments.size();
	}
	
	public void setSeatsLeft(int availableSeats) {
		_availableSeats = availableSeats;
	}
	
	public void addEnrollment(Enrollment enrollment) {
		_enrollments.add(enrollment);
	}
	
	public void removeEnrollment(Enrollment enrollment) {
		_enrollments.remove(enrollment);
	}

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
	}

}
