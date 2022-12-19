package oop;

public class Student extends Person {

	int studyLevel;
	String specialization;
	double GPA;
	
	
	public Student() {
		super();
	}


	public Student(String n, String ad, String s, int a, int studyLevel, String special, double gPA) {
		super(n, ad, s, a);
		this.studyLevel = studyLevel;
		this.specialization = special;
		GPA = gPA;
	}


	public int getStudyLevel() {
		return studyLevel;
	}


	public void setStudyLevel(int studyLevel) {
		this.studyLevel = studyLevel;
	}


	public String getSpecialization() {
		return specialization;
	}


	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}


	public double getGPA() {
		return GPA;
	}


	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	
	
}
