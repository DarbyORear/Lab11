package co.grandcircus.lab11;

//NOTE ON PRINT format:
/*   System.otu.printf("%s", 35);
 * >35
 * String example = String.format("%s", 35);
 * System.out.print(example);
 * >35;
 */

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
	
	public static void main(String[] args) {
		
		String userInput;
		Scanner scnr = new Scanner(System.in);
		
//Create a car object:
//		Car River = new Car("Kia", "Forte", 2014, 5000.00);
//		UsedCar Berned = new UsedCar("Nissan", "Altima", 1995, 3000.00, 315812.25);
		//You don't need to name the cars; you can define them direclty in the arrayList below
		
		//create an ArrayList
		ArrayList<Car> list = new ArrayList<>();
		list.add(new Car("Kia", "Forte", 2014, 10000));
		list.add(new UsedCar("Nissan", "Altima", 1995, 3000, 315812.25));
		list.add(new Car("Ford", "Fusion", 2010, 20000));
		list.add(new UsedCar("Ford", "Mercury", 2000, 5000, 200000));
		list.add(new Car("Toyota", "Corrolla", 2010, 15000));
		list.add(new UsedCar("Chevy", "Nova", 2000, 8000, 150000));
		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + ". " + list.get(i));
			
		}
		
		System.out.println("What would you like to do? (add a car, remove a car, or look up a car)?");
		scnr = new Scanner(System.in);
		userInput = scnr.nextLine();

		
		if(userInput.equals("add a car")) {
		list = doAdd(scnr, list);
		System.out.println(list);
		}
		
		
		if(userInput.equals("remove a car")) {
			
		}
	}
	
	
	//CREATE METHODS FOR LAB NUMBER: 11, PART 3, 4. (list cars, add a car, remove a car, look up a car);
	
	//NOTE: Need to ask the user what they want to do: add a car, remove a car, or look up a car.
	//OUTPUT SHOULD RESEMBLE CONSOLE PREVIEW ON PG 34. 
			//1. display list of cars (with a number, as shown on page 34) (done w/array list/for loop above + printCars method below.
			//2. Ask the user which car they want (ask them to input a number).
			//3. Display 
			//2. ask if the user wants to add a car, remove a car, or look up a car.
			//3. call the method to do one of those things.
			//4. Create a loop to keep asking the user if they want to continue.
	

	//Method to list all cars:  //NOTE I tried to cut/paste the for loop from above into this method instead. 
								//I thought it would make more sense, since the numbers are something we want printed. It doesn't work.
								//why not??
	public static void printCars(ArrayList<Car> list) {
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println((i + 1) + ". " + list.get(i));
		System.out.println(list);
		}
	
	//Ask user which car they want to get from the list: //THIS SHOULD BE FOR ACCESSING ONE IN THE LIST
	private static void getUserCar(Scanner scnr, ArrayList<Car> list) {
		System.out.println("Which car would you like to purchase? Please enter the number: ");
		scnr = new Scanner(System.in);
	}
	
	//Method to add a car:
	
	/*example: 
	 * 	private static void doAdd(Scanner scnr, ArrayList<String> list) {
		String name = Validator.getString(scnr, "Enter a name: ");
		
		Here's the getString method (created in Validator class) called:
			public static String getString(Scanner scnr, String prompt) {
		System.out.print(prompt);
		return scnr.nextLine();
		
		//So what's happening in the code above? In the same class as the main method, we're creating a method called doAdd that
		 * takes parameters (scanner and ArrayList list); 
		 * This is what the doAdd method does: it calls a method called getString that was created in the Validator class, gives
		 * it specific arguments (scnr and prompt), and stores it in a string variable called name.
	}
	 */
	private static ArrayList<Car> doAdd(Scanner scnr, ArrayList<Car> list) {
		
		String userInput = "";
		String newOrUsed;
		String userMake;
		String userModel;
		int userYear;
		double userPrice;
		double userMileage;
	
	do {
			//find out if car is used.
			//ask user for make, model, etc. of car (and mileage if applicable)
		System.out.println("Great! We can add a car to the list. Would you like to add a used car or a new one? Please enter \"new\" or \"used\"");
		scnr = new Scanner(System.in);
		

		newOrUsed = scnr.nextLine();
			if(newOrUsed.equals("new")) {
				//ask for make, model, year, and price
				System.out.println("What is the make of the car you'd like to add? ");
				userMake = scnr.nextLine();
//				Car.setMake(userMake);
				System.out.println("The model? ");
				userModel = scnr.nextLine();
				System.out.println("The year? ");
				userYear = scnr.nextInt();
				System.out.println("The price? ");
				userPrice = scnr.nextDouble();
				//create a new car:
				Car userNewCar = new Car(userMake, userModel, userYear, userPrice);
				list.add(userNewCar);
				
//				list.add(Car.userMake()); //???? scope issue??
//				String name = Validator.getString(scnr, "Enter a name: ");
				
				//Validator.getString() is:
				/*public static String getString(Scanner scnr, String prompt) {
				System.out.print(prompt);
				return scnr.nextLine();
			}*/
				
			} else if(newOrUsed.equals("used")) {
				//What's a shortcut to ask it to display all the questions above + one more? (super/sub class?)
				System.out.println("What is the make of the car you'd like to add? ");
				//Should I just be asking for one piece of information at a time...or only some of the information?
				userMake = scnr.nextLine();
				System.out.println("The model? ");
				userModel = scnr.nextLine();
				System.out.println("The year? ");
				userYear = scnr.nextInt();
				System.out.println("The price? ");
				userPrice = scnr.nextDouble();
				System.out.println("The mileage?");
				userMileage = scnr.nextDouble();
//				list.add(new Car(userMake, userModel, userYear, userPrice)); //???? scope issue??
				UsedCar userUsedCar = new UsedCar(userMake, userModel, userYear, userPrice, userMileage);
				list.add(userUsedCar);

			} else {
				System.out.println("Sorry, that's not a valid answer. ");
			}
		
		} while(userInput == "add a car");
	return list;
	
	//ADD CAR(S) TO ARRAYLIST AND PRINT OUT AGAIN: how do I do this??


}
}
//	
//private static void doRemove()
//	
//	
//	
//}

















