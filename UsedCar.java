
public class UsedCar extends Car {
	
   
	
	double mileage;

	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
		
	}
	
	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}


	@Override
	public String toString() {
		return "Used-Car: Make: " + make + ", Model: " + model + ", Year: " + year + ", Price: " + price + ", Mileage:" + mileage + "]";
	}

}
