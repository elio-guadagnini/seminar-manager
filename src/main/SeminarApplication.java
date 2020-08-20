package main;

import util.Lecturer;
import util.Seminar;
import util.Student;

public class SeminarApplication {

	public static void main(String[] args) {
		Seminar swEngineering = new Seminar("Sw is important.", new Lecturer("Mauro", "Peyye", 1));
		
		swEngineering.addStudent(new Student("Elio", "Guadagnini", "Master"));
		swEngineering.addStudent(new Student("Elio", "Guadagnini", "Bachelor"));
		
		swEngineering.printStudentList();
		
		print("Closed.");
	}
	
	public static void print(String message) {
		System.out.println(message);
	}
	
}

