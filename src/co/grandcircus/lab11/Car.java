package co.grandcircus.lab11;

import java.util.Scanner;
public class Car {

	//declare instance variables;
	private String make;
	private String model;
	private int year;
	private double price;
//	Scanner scnr = new Scanner(System.in);
	
	//create constructor for fields
	public Car(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	//create default constructors
	public Car() {
		
	}
	//get and set for make
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	//get and set for model
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	//get and set for year
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	//get and set for price
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
//	public static String getString(Scanner scnr, String prompt) {
//		// This approach uses exception handling.
//		System.out.print(prompt);
//		return scnr.nextLine();
//	}
	
	public static String userMake() {    //SHOULD RETURN TYPE BE CAR OR STRING??
		Scanner scnr = new Scanner(System.in);
		return scnr.nextLine();
		
	}

	//toString()
	//NOTE: setting toString (even on the parent class) automatically overrides the toString() that's built in to the super high-level Object class (which has some toString set to it).
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
//				+ ", getMake()="
//				+ getMake() + ", getModel()=" + getModel() + ", getYear()=" + getYear() + ", getPrice()=" + getPrice()
//				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
//				+ "]";
		
//		for (String eachCar : Car) {
			
			
		}
	//NOTE: CHANGE THE ABOVE TOSTRING SO THAT IT PRINTS OUT SOMETHING PRETTY. DAVID WILL SLACK CODE. also add a loop to add numbers
	}

	
	
	
	

