package oop;

public class Bottle implements Items {
	
	double price;
	String title;
	double volume;
	
	
	
	
	public Bottle(double price, String title, double volume) {
		super();
		this.price = price;
		this.title = title;
		this.volume = volume;
	}




	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}




	public double getVolume() {
		return volume;
	}




	public void setVolume(double volume) {
		this.volume = volume;
	}
	


	public void setPrice(double price) {
		this.price = price;
	}




	public double getRetailPrice() {
		
		return price;
	}

}
