package oop;

public class Person {
	
	String name;
	String adress;
	String sign;
	int age;
	
	
	public Person() {
		
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
	
	
	

}
