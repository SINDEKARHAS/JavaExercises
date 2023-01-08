package exercises;

 public class Javaexercise31{
	 
	 static void Age(int age) {
		 if(age<18)
		 {
			 throw new ArithmeticException("Access Denied Age must be greater than 18 years old");
			 
		 }
		 else {
			 System.out.println("Access granted !");
			 
		 }
	 }
	 
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Age(21);
		

	}

}
