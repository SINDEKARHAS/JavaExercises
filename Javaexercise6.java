package exercises;

public class Javaexercise6 {

	public static void main(String[] args) {
		int intArray[] = {0,1,2,3,4,5,6,7,8,9}; 
		 
		 int cloneArray[] = intArray.clone(); 
		 
		 // Deep copy is created following print statement will print false
		 System.out.println(intArray == cloneArray); 
		 
		 for (int i = 0; i < cloneArray.length; i++) { 
		 System.out.print(cloneArray[i]+" "); 
		 }

		
		
	}

}
