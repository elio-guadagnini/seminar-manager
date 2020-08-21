package main;

import util.Enrollment;
import util.Seminar;
import util.Student;

public class SeminarApplication {
	
	public static void main(String[] args) {
		Seminar swEngineering = new Seminar(new Course("Sw is important.", "1", "by ..."), "Lugano", 10);
		
		print(swEngineering.getName());
		print(swEngineering.getDescription());
		
		swEngineering.addEnrollment(new Enrollment(new Student("Elio", "Guadagnini")));
		swEngineering.addEnrollment(new Enrollment(new Student("Elio", "Guadagnino")));
		
		print(String.valueOf(swEngineering.getSeatsLeft()));
		swEngineering.printStudentList();
		
		print("Closed.");
	}
	
	public static void print(String message) {
		System.out.println(message);
	}
	
}

