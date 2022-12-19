package oop;

public class Main {

	public static void main (String[] args) {
		
		Student st1 = new Student();
		Student st2 = new Student("müller","Otto","scor",18,6, "since",2.97);
		
		System.out.println(st2.getGPA());
	}
	
	
}
