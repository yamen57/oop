package oop;

public abstract class Employee {
	
	String name;
	double age;
	double salary;
	String rank;
	String job;
	
	
	
	public Employee() {
		
	}
	
	public Employee(String name, double age, double salary, String rank, String job) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.rank = rank;
		this.job = job;
	}




	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getAge() {
		return age;
	}



	public void setAge(double age) {
		this.age = age;
	}

	
	
	
	//not all method have to be abstract 
	//only uncommon methods that change depending on the subclass 
	//salary of the employee change between e.g. salary based or hourly based 
	//so the abstract method has to be overridden in each sub class 
	public abstract double getSalary();






	public String getRank() {
		return rank;
	}



	public void setRank(String rank) {
		this.rank = rank;
	}



	public String getJob() {
		return job;
	}



	public void setJob(String job) {
		this.job = job;
	}
	
	
	
	
	
}
