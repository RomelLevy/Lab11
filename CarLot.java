import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarLot {

	private static List<Car> cars = new ArrayList<>();

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
	    int numOfCars;
	   

		System.out.println("Welcome to Grand Circus Motors admin console");
		System.out.println("What would you like to do? ");
		numOfCars = scnr.nextInt();
		 
		 
		
		//new cars
		cars.add(new Car("Dodge", "Charger", 2018, 500000)); 
		cars.add(new Car("Dodge", "Challenger", 2018, 500000));
		cars.add(new Car("Nissan", "GTR", 2018, 80.000));
        //used cars
        cars.add(new UsedCar("pontiac", "gto", 1967, 50.000, 4300));
		cars.add(new UsedCar("Ford", "Mustang", 1966, 70.000, 7000));
		cars.add(new UsedCar("Chevrolet", "Chevelle", 2018, 65.000, 38.000));


		boolean done = false;
		while (!done) {
			System.out.println("Select an option: (list, select, quit)");
			String option = scnr.nextLine();
			
			switch (option) {
			
			case "list":
				doListOption();
				break;
			case "select":
				doSelectOption();

				break;
			case "quit":
				done = true;
				break;
			default:
				System.out.println("Invalid choice...");
				break;
			}
		}

	}

	private static void doListOption() {
		for (int i = 0; i < cars.size(); i++) {
			System.out.println((i + 1) + "." + cars.get(i));
		}

	}

	private static void doSelectOption() {
	
		
	}

	private static void doAddOption() {

	}

}
