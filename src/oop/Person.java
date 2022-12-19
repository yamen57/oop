package oop;

public class Person {
	//protected private public 
	//public can be accessed from anywhere
	//private can be accessed from the same class defined in 
	//protected can be accessed from the Base class and all the derived ones (sub classes)
	
	protected String name;
	protected String adress;
	protected String sign;
	protected int age;
	
	
	public Person() {
		System.out.println("In the base class constructor");
		
	}

	
	public Person (String n, String ad, String s, int a) {
		name = n;
		adress = ad;
		sign = s;
		age = a;
	}
	//---------------------------------------------------
	// set
	public void setAge(int a) {
		age = a;
	}	
	
	public void setName(String n) {
		name = n;
	}
	
	
	
	public void setAdress(String ad) {
		adress = ad;
		
	}
	
	public void setSign(String s) {
		sign = s;
	}
	
	//----------------------------------------------
	// get
	
	public int getAge() {
		return age;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public String getAdress() {
		return adress;
	}
	
	public String getSign() {
		return sign;
	}
	
	
	public void printAllDetails() {
		
		System.out.println("Name : "+ name +"\nAdress : "+ adress+"\nSign : "+sign+ "\nAge : "+age);
		
	}
	//---------------------------------------------------
	// final methods 
	//can't override
	public final void printName (){
		System.out.println(name);
	}

}
