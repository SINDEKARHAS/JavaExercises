package exercises;

//creating a class named City
public class Javaexercise14
{
	
//declaring class variables
public String name;
public long population;


//defining the method of the class
public void display()
	{
	
System.out.println("City name: " +name);
System.out.println("Population: " +population);
	}

public static void main(String args[])

	{
//declaring the objects of the class City
Javaexercise14 metro1,metro2;

//Instantiating the objects of the class using the new keyword
metro1 = new Javaexercise14();
metro2 = new Javaexercise14();

metro1.name ="Mumbai";
metro1.population = 23409876;

System.out.println("Details of metro city 1:");
metro1.display(); 

//display() method is being invoked for the object metro1
metro2.name ="Pune";
metro2.population = 45874294;

System.out.println("Details of metro city 2:");
metro2.display(); 

//display() method is being invoked for the object metro2

	}
}



