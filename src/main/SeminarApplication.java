package main;

import java.util.Date;

import util.Enrollment;
import util.Lecturer;
import util.Seminar;
import util.Student;

public class SeminarApplication {
	
	public static void main(String[] args) {
		Seminar swEngineering = new Seminar("Sw is important.", new Lecturer("Mauro", "Peyye", 1));
		
	    Date date = new Date();  
		
		swEngineering.addEnrollment(new Enrollment(new Student("Elio", "Guadagnini", "Master"), date));
		swEngineering.addEnrollment(new Enrollment(new Student("Elio", "Guadagnini", "Bachelor"), date));
		
		swEngineering.printStudentList();
		
		print("Closed.");
	}
	
	public static void print(String message) {
		System.out.println(message);
	}
	
}

