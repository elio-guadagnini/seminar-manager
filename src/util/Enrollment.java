package util;

import java.util.Date;

public class Enrollment {

	private Student _student;
	private Date _dateEnrollment;
	
	public Enrollment(Student student, Date dateEnrollment) {
		_student = student;
		_dateEnrollment = dateEnrollment;
	}
	
	public Student getStudent() {
		return _student;
	}
	
	public Date getDate() {
		return _dateEnrollment;
	}
	
}
