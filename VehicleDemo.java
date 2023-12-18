// we write a simple program for vehicles which clears the 
//concepts of all OOP principles here step by step

//we create a abstract class to represent a generic vehicle

abstract class Vehicle {

//create two ojects with private access specifier of string data type
private String model;
private String color;

// we need a constructor to initialise the objects
public Vehicle (String model, String color){

//this keyword to refer a current instance of an object

this.model = model;
this.color = color;

}

//abstract method to display the information about the vehicle because its in //abstact class.

abstract void displayInfo();

//Encapsulation: use getter/setter to  return the private fields

public String getModel() {
	return model;
}

public String getColor() {
	return color;
	}

}

//Inheritance: Car class extending the properties of Vehicle Class here:
//extends keyword used for inheritance (is-a relationship)
class Car extends Vehicle{
private int numDoors;

//constructor
public Car(String model, String color, int numDoors){
	super(model, color);
	this.numDoors = numDoors;
}

//Polymorphism: Override the displayInfo method to provide the specific //implementation

@Override

void displayInfo() {
System.out.println("car model: "+getModel());
System.out.println("car Color: "+getColor());
System.out.println("number of Doors: "+numDoors);


	}

}

//Inheritance: Motorcycle class extending from the Vehicle class.

class Motorcycle extends Vehicle{
	private boolean hasSideCar;

//constructor
public Motorcycle(String model, String color, boolean hasSideCar){
	super(model, color);
	this.hasSideCar = hasSideCar;

}

//polymorphism: Override displayInfo method to provide specific implementation 

@Override
void displayInfo() {
System.out.println("MotorCycle Model: "+getModel());
System.out.println("MotorCycle Color: "+getColor());
System.out.println("Has a SideCar: "+hasSideCar);

	}
}

public class VehicleDemo {
	public static void main(String []args) {

//created a objects of car and motorcycle
Car myCar = new Car("Sedan", "Blue", 4);
Motorcycle myMotorcycle = new Motorcycle("Sports Bike", "Red", false);


//Polymorphism: using ca common refrence type  (Vehicle) for different objects
	Vehicle[] vehicles = {myCar, myMotorcycle};



//Display information about each vehicle

for(Vehicle vehicle : vehicles){
vehicle.displayInfo();
System.out.println("---------------------------------------------------------------------");


		} 

	}

}