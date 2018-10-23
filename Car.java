import java.util.Scanner;

public class Car {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int numOfCars;

		System.out.println("Welcome to Grand Circus Motors admin console");
		System.out.println("How many cars are you entering? ");
		numOfCars = scnr.nextInt();

	}

	String make;
	String model;
	public double price;
	int year;

	public Car() {
		super();

	}

	public Car(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public String getMake() {
		return make;

	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;

	}

	public double getPrice() {
		return price;

	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setYear(int year) {
		this.year = year;

	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car Make: " + make + ", Model: " + model + ", Year: " + year + " , Price: " + price;
	}

}