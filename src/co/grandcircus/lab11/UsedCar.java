package co.grandcircus.lab11;

public class UsedCar extends Car {
	
	private double mileage;

	//default constructor
	public UsedCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	//constructor
	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price); 
		this.mileage = mileage;
		// TODO Auto-generated constructor stub
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	

}
