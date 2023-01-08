package exercises;



public class Javaexercise30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int[] numbers = {1,2,3};
			System.out.println(numbers[50]);
			
		}
		catch(Exception e)
		{
			System.out.println("Error Occured !");
			
			
		}
		finally {
			System.out.println("The finally statement lets you  execute code, after try...catch," + "\nregardless of the result");
			
		}

	}

}
