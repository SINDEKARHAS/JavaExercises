package exercises;

public class Javaexercise8 {

	public static void main(String[] args) {
		
		String a = "Cooking"; 
		 System.out.println("String a = " + a); 
		 
		 // String declaration using new operator 
		 String b = new String("IoT"); 
		 System.out.println("String b = " + b);
		 
		 //There are many string methods available some String Methods are as follows
		 System.out.println("The length of the string: " + a.length());
		 System.out.println(a.toUpperCase());
		 System.out.println(a.toLowerCase());
		 
		 System.out.println(a + b);
		 System.out.println(a.concat(b));
		 
		 System.out.println("Character at position 5: " + a.charAt(5));
		 
		 System.out.println(a.equals(b));
		 System.out.println(a.equalsIgnoreCase(b));
		 
		 System.out.println(a.compareTo(b));
		 System.out.println(a.contains("X"));
	}

}
