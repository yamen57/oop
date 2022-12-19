package oop;

public class Salaried_Employee extends Employee{
	double bonus;
	double deduction;
	
	
	public Salaried_Employee() {
		
	}
	
	public Salaried_Employee(String name, double age, double salary, String rank, 
			String job, double bonus, double deduction) {
		super(name,age,salary,rank,job);
		this.bonus = bonus;
		this.deduction = deduction;
	}
	

	public double getSalary() {
		return salary + bonus - deduction ;
	}
	
	

}
